package Problems;

import java.io.File;
import java.io.IOException;

public class RecursiveFileDisplay {

	public static void main(String[] args) {
		File currentDir = new File("."); //For current directory use "."
		System.out.println("<"+"Directory"+" "+"rootName="+currentDir.getName()+">");
		displayDirectoryContents(currentDir);
		System.out.println("</"+"Directory"+">");
	}

	public static void displayDirectoryContents(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				//System.out.println("directory:" + file.getCanonicalPath());
				System.out.println("<"+"Directory"+" "+"name="+file.getName()+">");
				displayDirectoryContents(file);
				System.out.println("</"+"Directory"+">");
			} else {
				//System.out.println("     file:" + file.getCanonicalPath());
				System.out.println("<"+"File"+">"+file.getName()+"</"+"File"+">");
			}
		}
	}

}