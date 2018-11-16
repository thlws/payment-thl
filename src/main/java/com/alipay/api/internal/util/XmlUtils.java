package com.alipay.api.internal.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import com.alipay.api.AlipayApiException;

/**
 * Encapsulating XML common operations.
 *
 * @author carver
 * @since 1.0, Jun 12, 2007
 */
public final class XmlUtils {

    private static final String XMLNS_XSI = "xmlns:xsi";
    private static final String XSI_SCHEMA_LOCATION = "xsi:schemaLocation";
    private static final String LOGIC_YES = "yes";
    private static final String DEFAULT_ENCODE = "UTF-8";
    private static final String REG_INVALID_CHARS = "&#\\d+;";

    /**
     * Creates a new document instance.
     *
     * @return a new document instance
     * @throws AlipayApiException the alipay api exception
     */
    public static Document newDocument() throws AlipayApiException {
        Document doc = null;

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setExpandEntityReferences(false);
            documentBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            doc = documentBuilderFactory.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            throw new AlipayApiException(e);
        }

        return doc;
    }

    /**
     * Parses the content of the given XML file as an XML document.
     *
     * @param file the XML file instance
     * @return the document instance representing the entire XML document
     * @throws AlipayApiException the alipay api exception
     */
    public static Document getDocument(File file) throws AlipayApiException {
        InputStream in = getInputStream(file);
        return getDocument(in);
    }

    /**
     * Parses the content of the given stream as an XML document.
     *
     * @param in the XML file input stream
     * @return the document instance representing the entire XML document
     * @throws AlipayApiException the alipay api exception
     */
    public static Document getDocument(InputStream in) throws AlipayApiException {
        Document doc = null;

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setExpandEntityReferences(false);
            documentBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            doc = builder.parse(in);
        } catch (ParserConfigurationException e) {
            throw new AlipayApiException(e);
        } catch (SAXException e) {
            throw new AlipayApiException("XML_PARSE_ERROR", e);
        } catch (IOException e) {
            throw new AlipayApiException("XML_READ_ERROR", e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // nothing to do
                }
            }
        }

        return doc;
    }

    /**
     * Creates a root element as well as a new document with specific tag name.
     *
     * @param tagName the name of the root element
     * @return a new element instance
     * @throws AlipayApiException the alipay api exception
     */
    public static Element createRootElement(String tagName) throws AlipayApiException {
        Document doc = newDocument();
        Element root = doc.createElement(tagName);
        doc.appendChild(root);
        return root;
    }

    /**
     * Gets the root element from input stream.
     *
     * @param in the XML file input stream
     * @return the root element of parsed document
     * @throws AlipayApiException the alipay api exception
     */
    public static Element getRootElementFromStream(InputStream in)
 throws AlipayApiException {
        return getDocument(in).getDocumentElement();
    }

    /**
     * Gets the root element from given XML file.
     *
     * @param file the file
     * @return the root element of parsed document
     * @throws AlipayApiException the alipay api exception
     */
    public static Element getRootElementFromFile(File file)
 throws AlipayApiException {
        return getDocument(file).getDocumentElement();
    }

	/**
     * Gets the encoding pattern from given XML file.
     *
     * @param text the context of the XML file
     * @return the encoding pattern string of given XML file
     */
	private static String getEncoding(String text) {
        String result = "UTF-8";//默认编码格式

        String xml = text.trim();

        if (xml.startsWith("<?xml")) {
            int end = xml.indexOf("?>");
            String sub = xml.substring(0, end);
            StringTokenizer tokens = new StringTokenizer(sub, " =\"\'");

            while (tokens.hasMoreTokens()) {
                String token = tokens.nextToken();

                if ("encoding".equals(token)) {
                    if (tokens.hasMoreTokens()) {
                        result = tokens.nextToken();
                    }

                    break;
                }
            }
        }
        return result;
    }

    /**
     * Gets the root element from the given XML payload.
     *
     * @param payload the XML payload representing the XML file.
     * @return the root element of parsed document
     * @throws AlipayApiException the alipay api exception
     */
    public static Element getRootElementFromString(String payload)
 throws AlipayApiException {
        if (payload == null || payload.trim().length() < 1) {
            throw new AlipayApiException("XML_PAYLOAD_EMPTY");
        }

        byte[] bytes = null;

        try {
        	payload = StringUtils.stripNonValidXMLCharacters(payload);
			String encodeString = getEncoding(payload);
            bytes = payload.getBytes(encodeString);
        } catch (UnsupportedEncodingException e) {
            throw new AlipayApiException("XML_ENCODE_ERROR", e);
        }

        InputStream in = new ByteArrayInputStream(bytes);
        return getDocument(in).getDocumentElement();
    }

    /**
     * Gets the descendant elements list from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tag name
     * @return the NOT NULL descendant elements list
     */
    public static List<Element> getElements(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        List<Element> elements = new ArrayList<Element>();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node instanceof Element) {
                elements.add((Element) node);
            }
        }

        return elements;
    }

    /**
     * Gets the immediately descendant element from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tag name.
     * @return immediately descendant element of parent element, NULL otherwise.
     */
    public static Element getElement(Element parent, String tagName) {
        List<Element> children = getElements(parent, tagName);

        if (children.isEmpty()) {
            return null;
        } else {
            return children.get(0);
        }
    }

    /**
     * Gets the immediately child elements list from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tag name
     * @return the NOT NULL immediately child elements list
     */
    public static List<Element> getChildElements(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        List<Element> elements = new ArrayList<Element>();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node instanceof Element && node.getParentNode() == parent) {
                elements.add((Element) node);
            }
        }

        return elements;
    }

    /**
     * Gets the immediately child element from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tag name
     * @return immediately child element of parent element, NULL otherwise
     */
    public static Element getChildElement(Element parent, String tagName) {
        List<Element> children = getChildElements(parent, tagName);

        if (children.isEmpty()) {
            return null;
        } else {
            return children.get(0);
        }
    }

    /**
     * Gets the value of the child element by tag name under the given parent
     * element. If there is more than one child element, return the value of the
     * first one.
     *
     * @param parent  the parent element
     * @param tagName the tag name of the child element
     * @return value of the first child element, NULL if tag not exists
     */
    public static String getElementValue(Element parent, String tagName) {
		Element element = getChildElement(parent, tagName);
		if (element != null) {
			NodeList nodes = element.getChildNodes();
			if (nodes != null && nodes.getLength() > 0) {
				for (int i = 0; i < nodes.getLength(); i++) {
					Node node = nodes.item(i);
					if (node instanceof Text) {
						return ((Text) node).getData();
					}
				}
			}
		}

		return null;
	}

    /**
     * Gets the text value of current element.
     *
     * @param element the element
     * @return text value of the element, NULL if element not exists
     */
    public static String getElementValue(Element element) {
		if (element != null) {
			NodeList nodes = element.getChildNodes();
			if (nodes != null && nodes.getLength() > 0) {
				for (int i = 0; i < nodes.getLength(); i++) {
					Node node = nodes.item(i);
					if (node instanceof Text) {
						return ((Text) node).getData();
					}
				}
			}
		}

		return null;
	}

    /**
     * Appends the child element to the parent element.
     *
     * @param parent  the parent element
     * @param tagName the child element name
     * @return the child element added to the parent element
     */
    public static Element appendElement(Element parent, String tagName) {
        Element child = parent.getOwnerDocument().createElement(tagName);
        parent.appendChild(child);
        return child;
    }

    /**
     * Appends the child element as well as value to the parent element.
     *
     * @param parent  the parent element
     * @param tagName the child element name
     * @param value   the child element value
     * @return the child element added to the parent element
     */
    public static Element appendElement(Element parent, String tagName,
            String value) {
        Element child = appendElement(parent, tagName);
        child.appendChild(child.getOwnerDocument().createTextNode(value));
        return child;
    }

    /**
     * Appends another element as a child element.
     *
     * @param parent the parent element
     * @param child  the child element to append
     */
    public static void appendElement(Element parent, Element child) {
        Node tmp = parent.getOwnerDocument().importNode(child, true);
        parent.appendChild(tmp);
    }

    /**
     * Appends the CDATA element to the parent element.
     *
     * @param parent  the parent element
     * @param tagName the CDATA element name
     * @param value   the CDATA element value
     * @return the CDATA element added to the parent element
     */
    public static Element appendCDATAElement(Element parent, String tagName,
            String value) {
        Element child = appendElement(parent, tagName);
        if (value == null) { // avoid "null" word in the XML payload
            value = "";
        }

        Node cdata = child.getOwnerDocument().createCDATASection(value);
        child.appendChild(cdata);
        return child;
    }

    /**
     * Converts the Node/Element instance to XML payload.
     *
     * @param node the node/element instance to convert
     * @return the XML payload representing the node/element
     * @throws AlipayApiException the alipay api exception
     */
    public static String childNodeToString(Node node) throws AlipayApiException {
        String payload = null;

        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();

            Properties props = tf.getOutputProperties();
            props.setProperty(OutputKeys.OMIT_XML_DECLARATION, LOGIC_YES);
            tf.setOutputProperties(props);

            StringWriter writer = new StringWriter();
            tf.transform(new DOMSource(node), new StreamResult(writer));
            payload = writer.toString();
            payload = payload.replaceAll(REG_INVALID_CHARS, " ");
        } catch (TransformerException e) {
            throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
        }

        return payload;
    }

    /**
     * Converts the Node/Document/Element instance to XML payload.
     *
     * @param node the node/document/element instance to convert
     * @return the XML payload representing the node/document/element
     * @throws AlipayApiException the alipay api exception
     */
    public static String nodeToString(Node node) throws AlipayApiException {
        String payload = null;

        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();

            Properties props = tf.getOutputProperties();
            props.setProperty(OutputKeys.INDENT, LOGIC_YES);
            props.setProperty(OutputKeys.ENCODING, DEFAULT_ENCODE);
            tf.setOutputProperties(props);

            StringWriter writer = new StringWriter();
            tf.transform(new DOMSource(node), new StreamResult(writer));
            payload = writer.toString();
            payload = payload.replaceAll(REG_INVALID_CHARS, " ");
        } catch (TransformerException e) {
            throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
        }

        return payload;
    }

    /**
     * Converts the an XML file to XML payload.
     *
     * @param file the XML file instance
     * @return the XML payload representing the XML file
     * @throws AlipayApiException the alipay api exception
     */
    public static String xmlToString(File file) throws AlipayApiException {
        Element root = getRootElementFromFile(file);
        return nodeToString(root);
    }

    /**
     * Converts the an XML file input stream to XML payload.
     *
     * @param in the XML file input stream
     * @return the payload represents the XML file
     * @throws AlipayApiException the alipay api exception
     */
    public static String xmlToString(InputStream in) throws AlipayApiException {
        Element root = getRootElementFromStream(in);
        return nodeToString(root);
    }

    /**
     * Saves the node/document/element as XML file.
     *
     * @param doc  the XML node/document/element to save
     * @param file the XML file to save
     * @throws AlipayApiException the alipay api exception
     */
    public static void saveToXml(Node doc, File file) throws AlipayApiException {
        OutputStream out = null;

        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();

            Properties props = tf.getOutputProperties();
            props.setProperty(OutputKeys.METHOD, XMLConstants.XML_NS_PREFIX);
            props.setProperty(OutputKeys.INDENT, LOGIC_YES);
            tf.setOutputProperties(props);

            DOMSource dom = new DOMSource(doc);
            out = getOutputStream(file);
            Result result = new StreamResult(out);
            tf.transform(dom, result);
        } catch (TransformerException e) {
            throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // nothing to do
                }
            }
        }
    }

    /**
     * Validates the element tree context via given XML schema file.
     *
     * @param doc        the XML document to validate
     * @param schemaFile the XML schema file instance
     * @throws AlipayApiException the alipay api exception
     */
    public static void validateXml(Node doc, File schemaFile)
 throws AlipayApiException {
        validateXml(doc, getInputStream(schemaFile));
    }

    /**
     * Validates the element tree context via given XML schema file.
     *
     * @param doc          the XML document to validate
     * @param schemaStream the XML schema file input stream
     * @throws AlipayApiException the alipay api exception
     */
    public static void validateXml(Node doc, InputStream schemaStream)
 throws AlipayApiException {
        try {
            Source source = new StreamSource(schemaStream);
            Schema schema = SchemaFactory.newInstance(
                    XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(source);

            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(doc));
        } catch (SAXException e) {
            throw new AlipayApiException("XML_VALIDATE_ERROR", e);
        } catch (IOException e) {
            throw new AlipayApiException("XML_READ_ERROR", e);
        } finally {
            if (schemaStream != null) {
                try {
                    schemaStream.close();
                } catch (IOException e) {
                    // nothing to do
                }
            }
        }
    }

    /**
     * Transforms the XML content to XHTML/HTML format string with the XSL.
     *
     * @param payload  the XML payload to convert
     * @param xsltFile the XML stylesheet file
     * @return the transformed XHTML/HTML format string
     * @throws AlipayApiException the alipay api exception
     */
    public static String xmlToHtml(String payload, File xsltFile)
 throws AlipayApiException {
        String result = null;

        try {
            Source template = new StreamSource(xsltFile);
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer(template);

            Properties props = transformer.getOutputProperties();
            props.setProperty(OutputKeys.OMIT_XML_DECLARATION, LOGIC_YES);
            transformer.setOutputProperties(props);

            StreamSource source = new StreamSource(new StringReader(payload));
            StreamResult sr = new StreamResult(new StringWriter());
            transformer.transform(source, sr);

            result = sr.getWriter().toString();
        } catch (TransformerException e) {
            throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
        }

        return result;
    }

    /**
     * Sets the namespace to specific element.
     *
     * @param element        the element to set
     * @param namespace      the namespace to set
     * @param schemaLocation the XML schema file location URI
     */
    public static void setNamespace(Element element, String namespace,
            String schemaLocation) {
        element.setAttributeNS(XMLConstants.XMLNS_ATTRIBUTE_NS_URI,
                XMLConstants.XMLNS_ATTRIBUTE, namespace);
        element.setAttributeNS(XMLConstants.XMLNS_ATTRIBUTE_NS_URI, XMLNS_XSI,
                XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
        element.setAttributeNS(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI,
                XSI_SCHEMA_LOCATION, schemaLocation);
    }

    /**
     * Encode the XML payload to legality character.
     *
     * @param payload the XML payload to encode
     * @return the encoded XML payload
     * @throws AlipayApiException the alipay api exception
     */
    public static String encodeXml(String payload) throws AlipayApiException {
        Element root = createRootElement(XMLConstants.XML_NS_PREFIX);
        root.appendChild(root.getOwnerDocument().createTextNode(payload));
        return childNodeToString(root.getFirstChild());
    }

    private static InputStream getInputStream(File file) throws AlipayApiException {
        InputStream in = null;

        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new AlipayApiException("FILE_NOT_FOUND", e);
        }

        return in;
    }

    private static OutputStream getOutputStream(File file) throws AlipayApiException {
        OutputStream in = null;

        try {
            in = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new AlipayApiException("FILE_NOT_FOUND", e);
        }

        return in;
    }

}
