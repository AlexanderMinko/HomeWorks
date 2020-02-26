package com.itbulls.learnit.Minko.HW8;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		String path = "C:\\Users\\Alexander Minko\\eclipse-workspace\\intoMaster.txt";
		File f = new File(path);
		File folder = f.getParentFile();
		
		for(File file:folder.listFiles()) {
			System.out.println(file.getName());
		}		
	}
}
