package com.itbulls.learnit.Minko.HW8;

import java.io.*;

public class FileDemo {
	public static int n = 0;
	public static int i = 0;

	public static void main(String[] args) {
		String path = "C:\\Users\\Alexander Minko\\eclipse-workspace";
		String exten = ".java";
		int count = getListFiles(path, exten);
		System.out.println("Files with .java extension in path " + path + ": " + count);
	}

	public static int getListFiles(String folder, String extension) {
		FileFilter filefilter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				if (file.getName().endsWith(extension)) {
					return true;
				}
				return false;
			}
		};
		File f = new File(folder);
		for (File file : f.listFiles()) {
			if (file.isFile() && filefilter.accept(file)) {
				n++;
			} else if (file.isDirectory()) {
				getListFiles(file.getAbsolutePath(), extension);
			}
		}
		return n;
	}
}
