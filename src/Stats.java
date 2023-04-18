import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.io.StringWriter;

/*
{"competitiveStats":{
    "awards":{
        "cards":0,
        "medals":0,
        "medalsBronze":0,
        "medalsSilver":0,
        "medalsGold":0},
    "games":{
        "played":126,
        "won":62},
    "season":null},
"endorsement":3,
"endorsementIcon":"https://static.playoverwatch.com/img/pages/career/icons/endorsement/3-8ccb5f0aef.svg#icon",
"gamesLost":149,
"gamesPlayed":287,
"gamesWon":138,
"icon":"https://d15f34w2p8l1cc.cloudfront.net/overwatch/18324accdcf709d7ab5d9ba17f690466254e172f1aa82b50fcbc92e95eb13089.png",
"name":"ThatGuy",
"private":false,
"quickPlayStats":{
    "awards":{
        "cards":0,
        "medals":0,
        "medalsBronze":0,
        "medalsSilver":0,
        "medalsGold":0},
    "games":{
        "played":161,
        "won":76}
    },
"rating":0,
"ratingIcon":"",
"ratings":[
    {
        "group":"Silver",
        "tier":4,
        "role":"tank",
        "roleIcon":"https://static.playoverwatch.com/img/pages/career/icons/role/tank-f64702b684.svg#icon",
        "rankIcon":"https://static.playoverwatch.com/img/pages/career/icons/rank/SilverTier-4-a9cdcd1a39.png"},
    {
        "group":"Gold",
        "tier":1,
        "role":"support",
        "roleIcon":"https://static.playoverwatch.com/img/pages/career/icons/role/support-0258e13d85.svg#icon",
        "rankIcon":"https://static.playoverwatch.com/img/pages/career/icons/rank/GoldTier-1-44f03fb9ca.png"
        }
    ]
}
*/
public class Stats {
//TODO change variables to new JSON names



    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter answer = new StringWriter();
        try {
            mapper.writeValue(answer, this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer.toString();
    }
}

class GameStats{



    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter answer = new StringWriter();
        try {
            mapper.writeValue(answer, this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer.toString();
    }


}

class Games{

    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter answer = new StringWriter();
        try {
            mapper.writeValue(answer, this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer.toString();
    }
}

class Awards{


    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter answer = new StringWriter();
        try {
            mapper.writeValue(answer, this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer.toString();
    }
}
