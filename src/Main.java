import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;


public class Main {
    public static void main(String[] args) {
        try{
            Stats eliStats = StatFinder.getPlayerInfo("ThatGuy-15264");
        } catch(Exception e){
            System.out.println(e);
        }


    }
}