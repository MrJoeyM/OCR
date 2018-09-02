package cn.edu.whu.extract2;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
public class Extract {  
  
    public static void main(String[] args) {
       OCR ocr = new OCR();
       String originalImgPath = "img/32.png";
       String newImgPath = "img/1.png";
       String result = ocr.ocrWithFile(originalImgPath);
       System.out.println(result);
    }    
  
}  
