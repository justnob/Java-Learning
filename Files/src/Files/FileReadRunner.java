package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path fileToRead = Paths.get("./resources/Data.txt");
		//List<String> line = Files.readAllLines(fileToRead);
		//System.out.println(line);
		
		Files.lines(fileToRead)
	    .map(String::toLowerCase)
		.filter(str -> str.contains("a"))
		.forEach(System.out::println);
	}

}
