package Problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttribute;

public class TestString {
public static void main(String[] args) throws IOException {
	
	GetStringBuffer.getStringBuffer().append("Hi I am Rahul : 1");

	GetStringBuffer.getStringBuffer().append(System.lineSeparator());
	GetStringBuffer.getStringBuffer().append("Hi I am Rahul : 1");
	System.out.println(GetStringBuffer.getStringBuffer().toString());
	
	
	
	Path path = Paths.get("src\\Output.xml");
	Files.write(path, GetStringBuffer.getStringBuffer().toString().getBytes());
	
	
}
}
