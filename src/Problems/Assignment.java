package Problems;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Assignment {
	public static void main(String[] args) {

		File currentDir = new File("."); // For current directory use "."
		GetStringBuffer.getStringBuffer()
				.append("<" + "Directory" + " " + "rootName=" + currentDir.getName() + ">" + System.lineSeparator());
		displayDirectoryContents(currentDir);
		GetStringBuffer.getStringBuffer().append("</" + "Directory" + ">" + System.lineSeparator());
		Path path = Paths.get("src\\Output.xml");
		try {
			Files.write(path, GetStringBuffer.getStringBuffer().toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param dir
	 */
	public static void displayDirectoryContents(File dir) {
		if (dir.exists()) {
			printTreeSrtucture(dir, 1);
		} else {
			System.out.println("Exception :" + "Path is not valid");
		}

	}

	/**
	 * @param dir
	 * @param indent
	 */
	public static void printTreeSrtucture(File dir, int indent) {

		File[] files = dir.listFiles();
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
					depth = depth - 1;
				}
				try {
					GetStringBuffer.getStringBuffer()
							.append("<" + "Directory" + " " + "name=" + file.getName() + " " + "path="
									+ file.getCanonicalPath() + " " + "size="
									+ Files.size(Paths.get(file.getCanonicalPath())) + ">" + System.lineSeparator());
				} catch (IOException e) {
					e.printStackTrace();
				}
				printTreeSrtucture(file, indent + 1);

				while (depth != indent) {
					GetStringBuffer.getStringBuffer().append("\t");
					depth = depth + 1;
				}
				GetStringBuffer.getStringBuffer().append("</" + "Directory" + ">" + System.lineSeparator());
			} else {
				StringBuffer sb = new StringBuffer();
				while (depth > 0) {
					sb.append("\t");
					depth = depth - 1;
				}

				GetStringBuffer.getStringBuffer().append(sb.toString() + "<" + "File" + ">" + System.lineSeparator());
				GetStringBuffer.getStringBuffer().append("\t" + sb.toString() + "<" + "filename" + ">" + file.getName()
						+ "</" + "filename" + ">" + System.lineSeparator());
				try {
					GetStringBuffer.getStringBuffer().append("\t" + sb.toString() + "<" + "filepath" + ">"
							+ file.getCanonicalPath() + "</" + "filepath" + ">" + System.lineSeparator());
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					GetStringBuffer.getStringBuffer()
							.append("\t" + sb.toString() + "<" + "filesize" + ">"
									+ Files.size(Paths.get(file.getCanonicalPath())) + "</" + "filesize" + ">"
									+ System.lineSeparator());
				} catch (IOException e) {
					e.printStackTrace();
				}
				GetStringBuffer.getStringBuffer().append(sb.toString() + "</" + "File" + ">" + System.lineSeparator());
			}
		}
	}

}
