package cn.edu.whu.extract1;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
public class Extract {  
  
	public static Mat overlayImg(Mat fore, Mat back){
		Mat result = back.clone();
		for(int i = 0;i < fore.cols();i++){
			for(int j = 0;j < fore.rows();j++){
				double[] data1 = fore.get(i, j);
				result.put(i, j, data1);
			}
		}
		return result;
	}
	
	
	

    public static void main(String[] args) {
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  
        OCR ocr = new OCR();
        String originalImgPath = "img/1.png";
        
        //¶ÁÈ¡Í¼Æ¬
        Mat img = Imgcodecs.imread(originalImgPath, -1);
        Mat back = new Mat(new Size(img.cols(),img.rows()),CvType.CV_8UC3,new Scalar(255,255,255));
        List<Mat> l = new ArrayList<Mat>();
        Core.split(img, l);
      
        Mat result = new Mat();
        
        ShowImage window = new ShowImage(result); 
        window.getFrame().setVisible(true);
//        String result = ocr.ocrWithMat(l.get(3));
//        System.out.println(result);
    }    
  
}  
