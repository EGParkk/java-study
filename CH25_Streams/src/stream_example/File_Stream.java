package stream_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\java502\\EonGyu\\JAVA\\java-study\\CH22_CollectionsAPI\\TheGreatGatsby.txt");
		
		Files.lines(path).forEach(s -> System.out.println(s));
	}

}
