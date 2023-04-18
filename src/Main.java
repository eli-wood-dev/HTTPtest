import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import com.fasterxml.jackson.core.*;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://ow-api.com/v1/stats/pc/us/ThatGuy-15264/profile")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}