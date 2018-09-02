package cn.edu.whu.extract1;
    
import java.awt.image.BufferedImage;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.opencv.core.Mat;

public class OCR {    
  
	
	public String ocrWithMat(Mat mat){
		Tesseract instance = new Tesseract();
		instance.setLanguage("chi_sim");
		BufferedImage bi = new MatToBufImg(mat, ".png").getImage();

		String result = null;
		try{
			result = instance.doOCR(bi);
		}catch(TesseractException e){
			e.printStackTrace();
		}
		return result;
    }
}   