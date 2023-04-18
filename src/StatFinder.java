import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class StatFinder {

    /**
     * @param playerName player name and number separated via a -
     * @return the stats of the chosen player, if found
     * @throws Exception an Exception
     */
    public static Stats getPlayerInfo(String playerName) throws Exception{
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://ow-api.com/v1/stats/pc/us/"+ playerName + "/profile")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        ObjectMapper mapper = new ObjectMapper();

        //clean the word private out of the json
        String jsonBody = response.body();

        if(jsonBody.contains("private")){
            String[]temp = jsonBody.split("private");

            jsonBody = temp[0] + "privateAccount" + temp[1];
        }

        return mapper.readValue(jsonBody, Stats.class);
    }


}
