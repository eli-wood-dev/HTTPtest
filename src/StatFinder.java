import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class StatFinder {

    /**
     * @param playerName player name and number separated via -
     * @return the stats of the chosen player, if found
     * @throws Exception an Exception
     */
    public static Stats getPlayerInfo(String playerName) throws Exception{
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://ow-api.com/v1/stats/pc/us/"+ playerName + "/profile")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode()); //TODO remove prints
        System.out.println(response.body());


        ObjectMapper mapper = new ObjectMapper();

        return new Stats();//TODO add an actual Stats
    }


}
