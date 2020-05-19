import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * Java 11 HttpClient Sample example
 */
public class Example4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		var request = HttpRequest.newBuilder()
						.uri(URI.create("http://www.kode12.com"))
						.GET()
						.build();
		
		var httpClient = HttpClient.newHttpClient();
		var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body());
								
	}
}
