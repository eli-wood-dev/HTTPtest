public class Stats {
//TODO implement the stuff from the api



}

class GameStats{
    private double eliminationsAvg;
    private int damageDoneAvg;
    private double deathsAvg;
    private double finalBlowsAvg;
    private int healingDoneAvg;
    private double objectiveKillsAvg;
    private String objectiveTimeAvg;
    private double soloKillsAvg;
    private Games games;
    private Awards awards;

    public Awards getAwards() {
        return awards;
    }

    public void setAwards(Awards awards) {
        this.awards = awards;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public double getSoloKillsAvg() {
        return soloKillsAvg;
    }

    public void setSoloKillsAvg(double soloKillsAvg) {
        this.soloKillsAvg = soloKillsAvg;
    }

    public String getObjectiveTimeAvg() {
        return objectiveTimeAvg;
    }

    public void setObjectiveTimeAvg(String objectiveTimeAvg) {
        this.objectiveTimeAvg = objectiveTimeAvg;
    }

    public double getObjectiveKillsAvg() {
        return objectiveKillsAvg;
    }

    public void setObjectiveKillsAvg(double objectiveKillsAvg) {
        this.objectiveKillsAvg = objectiveKillsAvg;
    }

    public double getFinalBlowsAvg() {
        return finalBlowsAvg;
    }

    public void setFinalBlowsAvg(double finalBlowsAvg) {
        this.finalBlowsAvg = finalBlowsAvg;
    }

    public double getDeathsAvg() {
        return deathsAvg;
    }

    public void setDeathsAvg(double deathsAvg) {
        this.deathsAvg = deathsAvg;
    }

    public int getDamageDoneAvg() {
        return damageDoneAvg;
    }

    public void setDamageDoneAvg(int damageDoneAvg) {
        this.damageDoneAvg = damageDoneAvg;
    }

    public double getEliminationsAvg() {
        return eliminationsAvg;
    }

    public void setEliminationsAvg(double eliminationsAvg) {
        this.eliminationsAvg = eliminationsAvg;
    }

    public void setHealingDoneAvg(int healingDoneAvg) {
        this.healingDoneAvg = healingDoneAvg;
    }

    public int getHealingDoneAvg() {
        return healingDoneAvg;
    }

    public String toString(){
        return "{eliminationsAvg: " + eliminationsAvg + ",damageDoneAvg: " + damageDoneAvg + ",deathsAvg: " + deathsAvg + ",finalBlowsAvg: " + deathsAvg + ",finalBlowsAvg: " + finalBlowsAvg + ",healingDoneAvg: " + healingDoneAvg + ",objectiveKillsAvg: " + objectiveKillsAvg + ",objectiveTimeAvg: " + objectiveTimeAvg + ",soloKillsAvg: " + soloKillsAvg + ",games: " + games + ",awards: " + awards + "}";
    }


}

class Games{
    private int played;
    private int won;

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public String toString(){
        return "{played: " + played + ",won: " + won + "}";
    }
}

class Awards{
    private int cards;
    private int medals;
    private int medalsBronze;
    private int medalsSilver;
    private int medalsGold;

    public int getCards() {
        return cards;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public int getMedalsBronze() {
        return medalsBronze;
    }

    public void setMedalsBronze(int medalsBronze) {
        this.medalsBronze = medalsBronze;
    }

    public int getMedalsSilver() {
        return medalsSilver;
    }

    public void setMedalsSilver(int medalsSilver) {
        this.medalsSilver = medalsSilver;
    }

    public int getMedalsGold() {
        return medalsGold;
    }

    public void setMedalsGold(int medalsGold) {
        this.medalsGold = medalsGold;
    }

    public String toString(){
        return "{cards: " + cards + ",medals: " + medals + ",medalsBronze: " + medalsBronze + ",medalsSilver: " + medalsSilver + ",medalsGold: " + medalsGold + "}";
    }
}
