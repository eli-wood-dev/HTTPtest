
public class Main {
    public static void main(String[] args) {
        try{
            Stats eliStats = StatFinder.getPlayerInfo("ThatGuy-15264", true);
            System.out.println(eliStats);
        } catch(Exception e){
            System.out.println(e);
        }


    }
}