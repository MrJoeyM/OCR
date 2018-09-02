package cn.edu.whu.extract2;
    
import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


    
public class OCR {    
   

	
	public String ocrWithFile(String imgPath){
		Tesseract instance = new Tesseract();
		instance.setLanguage("chi_sim");

		String result = null;
		try{
			result = instance.doOCR(new File(imgPath));
		}catch(TesseractException e){
			e.printStackTrace();
		}
		return result;
    }
}   