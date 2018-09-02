package cn.edu.whu.extract1;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;

public class GetImg {

	static{
		System.loadLibrary("getImg");
	}
	public native static void get();
	
	public static void main(String[] args) {
        get();
	}
}
