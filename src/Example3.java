import java.io.IOException;
import java.nio.file.Files;

/*
 * Java 11 reading/writing strings to and from files Sample example
 */

public class Example3 {
	
	public static void main(String[] args) throws IOException {
		
		var path  = Files.writeString(Files.createTempFile("Sample", ".txt"),"This is Sample file");
		System.out.println(path);
		var lines = Files.readString(path);
		System.out.println(lines);
		Files.delete(path);
	}
	
}
