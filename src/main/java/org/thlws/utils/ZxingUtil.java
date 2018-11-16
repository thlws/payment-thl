package org.thlws.utils;

import java.io.File;
import java.util.Hashtable;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/***
 * 条形码 二维码 生成工具类
 */
public class ZxingUtil {

	static int qrcode_default_width = 250;
	static int qrcode_default_height = 250;

	static int barcode_default_width = 700;
	static int barcode_default_height = 200;
	private static final Log log = LogFactory.get();

    public static void barCode(String contents,String imgPath,int width, int height) {
        int codeWidth = 3 + // start guard
                (7 * 6) + // left bars
                5 + // middle guard
                (7 * 6) + // right bars
                3; // end guard
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

	public static void barCode(String contents,String imgPath) {
		barCode(contents,imgPath,barcode_default_width,barcode_default_height);
	}



	public static void qrCode(String content,String suffix,String imgPath){
		qrCode(qrcode_default_width,qrcode_default_height,content,suffix,imgPath);
	}



	public static BitMatrix deleteWhite(BitMatrix matrix){
		int[] rec = matrix.getEnclosingRectangle();
		int resWidth = rec[2] + 1;
		int resHeight = rec[3] + 1;

		BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
		resMatrix.clear();
		for (int i = 0; i < resWidth; i++) {
			for (int j = 0; j < resHeight; j++) {
				if (matrix.get(i + rec[0], j + rec[1]))
					resMatrix.set(i, j);
			}
		}
		return resMatrix;
	}


    public static void main(String[] args) {
    	qrCode(250,250,"18650002030j0803151618030","png","/zone/test.png");
    	barCode("18650002030j0803151618030","/zone/barcode.png",700,200);
	}
}
