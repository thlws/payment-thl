package org.thlws.utils;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.util.Hashtable;

/***
 * 条形码 二维码 生成工具类
 */
public class ZxingUtil {

    /**
     * The Qrcode default width.
     */
    static int qrcode_default_width = 250;
    /**
     * The Qrcode default height.
     */
    static int qrcode_default_height = 250;

    /**
     * The Barcode default width.
     */
    static int barcode_default_width = 700;
    /**
     * The Barcode default height.
     */
    static int barcode_default_height = 200;
	private static final Log log = LogFactory.get();

    /**
     * Bar code.
     *
     * @param contents the contents
     * @param imgPath  the img path
     * @param width    the width
     * @param height   the height
     */
    public static void barCode(String contents,String imgPath,int width, int height) {
        int codeWidth = 3 +
                (7 * 6) +
                5 +
                (7 * 6) +
                3;
        codeWidth = Math.max(codeWidth, width);
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents,BarcodeFormat.CODE_128, codeWidth, height, null);
            bitMatrix = deleteWhite(bitMatrix);
            MatrixToImageWriter.writeToFile(bitMatrix, "png", new File(imgPath));
        }catch (Exception e) {
        	log.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Qr code.
     *
     * @param width   the width
     * @param height  the height
     * @param content the content
     * @param suffix  the suffix
     * @param imgPath the img path
     */
    public static void qrCode(int width,int height,String content,String suffix,String imgPath){
    	Hashtable<EncodeHintType, String> hints= new Hashtable<EncodeHintType, String>();
    	hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
    	BitMatrix bitMatrix;
    	try {
    		bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hints);
    		bitMatrix = deleteWhite(bitMatrix);
			File outputFile = new File(imgPath);
    		MatrixToImageWriter.writeToFile(bitMatrix, suffix, outputFile);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    /**
     * Bar code.
     *
     * @param contents the contents
     * @param imgPath  the img path
     */
    public static void barCode(String contents,String imgPath) {
		barCode(contents,imgPath,barcode_default_width,barcode_default_height);
	}


    /**
     * Qr code.
     *
     * @param content the content
     * @param suffix  the suffix
     * @param imgPath the img path
     */
    public static void qrCode(String content,String suffix,String imgPath){
		qrCode(qrcode_default_width,qrcode_default_height,content,suffix,imgPath);
	}


    /**
     * Delete white bit matrix.
     *
     * @param matrix the matrix
     * @return the bit matrix
     */
    public static BitMatrix deleteWhite(BitMatrix matrix){
		int[] rec = matrix.getEnclosingRectangle();
		int resWidth = rec[2] + 1;
		int resHeight = rec[3] + 1;

		BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
		resMatrix.clear();
		for (int i = 0; i < resWidth; i++) {
			for (int j = 0; j < resHeight; j++) {
				if (matrix.get(i + rec[0], j + rec[1])) {
					resMatrix.set(i, j);
				}
			}
		}
		return resMatrix;
	}


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
    	qrCode(250,250,"18650002030j0803151618030","png","/zone/test.png");
    	barCode("18650002030j0803151618030","/zone/barcode.png",700,200);
	}
}
