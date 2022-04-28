package javadatastructures.algorithms.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 
 *another way to list the contents of a directory, but this time using streams:
 *
 */
public class Example03 {

	public static void main(String[] args) throws IOException {
		
		String stringPath= System.getProperty("java.io.tmpdir");
		Path path= Paths.get(stringPath);
		Stream<Path> filesNames=Files.list(path);
		filesNames.limit(5).forEach(System.out::println);
	}

}
