package com.itbulls.learnit.Minko.HW8;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class FileDemo3 {
	public static ArrayList<File> filesToString = new ArrayList<>();
	public static String name = "";
	public static void main(String[] args) {
		String path = "C:\\Users\\Alexander Minko\\eclipse-workspace";
		String exten = ".java";
		getListFiles(path, exten);
		for(File file:filesToString) {
			name+=file.getName();
		}
		System.out.println(name);
	}

	public static void getListFiles(String folder, String extension) {
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
				filesToString.add(file);
			} else if (file.isDirectory()) {
				getListFiles(file.getAbsolutePath(), extension);
			}
		}
	}
}
