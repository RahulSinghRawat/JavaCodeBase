package Problems;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {

		File currentDir = new File("."); // For current directory use "."
		// File currentDir = new File("C:\\XmlPath");
		GetStringBuffer.getStringBuffer()
				.append("<" + "Directory" + " " + "rootName=" + currentDir.getName() + ">" + System.lineSeparator());
		// System.out.println("<"+"Directory"+" "+"rootName="+currentDir.getName()+">");
		displayDirectoryContents(currentDir);
		GetStringBuffer.getStringBuffer().append("</" + "Directory" + ">" + System.lineSeparator());
		// System.out.println("</"+"Directory"+">");

		Path path = Paths.get("src\\Output.xml");
		try {
			Files.write(path, GetStringBuffer.getStringBuffer().toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void displayDirectoryContents(File dir) {
		if (dir.exists()) {
			printTreeSrtucture(dir, 1);
		} else {
			System.out.println("Exception :" + "Path is not valid");
		}

	}

	public static void printTreeSrtucture(File dir, int indent) {

		File[] files = dir.listFiles();
		// List<File> list = Arrays.asList(files);
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File f1, File f2) {
				return (f1.getName().compareTo(f2.getName()));
			}
		});
		for (File file : files) {
			int depth = indent;
			if (file.isDirectory()) {
				while (depth > 0) {
					GetStringBuffer.getStringBuffer().append("\t");
					// System.out.print('\t');
					depth = depth - 1;
				}
				// System.out.println("directory:" + file.getCanonicalPath());
				try {
					GetStringBuffer.getStringBuffer()
							.append("<" + "Directory" + " " + "name=" + file.getName() + " " + "path="+file.getCanonicalPath()+ " " + "size="+Files.size(Paths.get(file.getCanonicalPath()))+">" + System.lineSeparator());
				} catch (IOException e) {
					e.printStackTrace();
				}
				// System.out.println("<"+"Directory"+" "+"name="+file.getName()+">");
				printTreeSrtucture(file, indent + 1);

				while (depth != indent) {
					GetStringBuffer.getStringBuffer().append("\t");
					// System.out.print('\t');
					depth = depth + 1;
				}
				GetStringBuffer.getStringBuffer().append("</" + "Directory" + ">" + System.lineSeparator());
				// System.out.println("</"+"Directory"+">");
			} else {
				// System.out.println(" file:" + file.getCanonicalPath());
				String str = "";
				while (depth > 0) {
				GetStringBuffer.getStringBuffer().append("\t");
					depth = depth - 1;
				}
				try {
					GetStringBuffer.getStringBuffer().append("");
					GetStringBuffer.getStringBuffer()
							.append("<" + "File" + ">" +"name="+ file.getName() +" "+"path="+file.getCanonicalPath()+ " " +"size="+Files.size(Paths.get(file.getCanonicalPath())) + "</" + "File" + ">" + System.lineSeparator());
 
				} catch (IOException e) {
					e.printStackTrace();
				}
				 /* GetStringBuffer.getStringBuffer().append("<"+ "filename"+ ">" + file.getName() + "</"+ "filename"+ ">"+System.lineSeparator());
			      GetStringBuffer.getStringBuffer().append("<"+ "filepath"+ ">" + file.getCanonicalPath() + "</"+ "filepath" +">"+System.lineSeparator());
			      GetStringBuffer.getStringBuffer().append("<"+ "filesize"+ ">" + Files.size(Paths.get(file.getCanonicalPath())) + "</"+"filesize"+">"+System.lineSeparator());*/
				// System.out.println("<"+"File"+">"+file.getName()+"</"+"File"+">");
			}
		}
	}

}
