package amar.api.a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWrightRunner {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./resources/sample.txt");
		String readString = Files.readString(path);
		
		System.out.println(readString);
		
		String newFileContent = readString.replace("Line", "Amarnath");
		System.out.println(newFileContent);
		
		String seconfFile = readString.replace("Amarnath", "Lines");
		Path newPath = Paths.get("./resources/sample-new.txt");
		 Files.writeString(newPath, seconfFile);
		
		

	}

}
