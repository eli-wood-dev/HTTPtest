import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.io.StringWriter;

public class Stats {
    private GameStats competitiveStats;
    private GameStats quickPlayStats;
    private RankGroup[] ratings;
    private String ratingIcon;
    private int rating;
    private String name;
    private int endorsement;
    private String endorsementIcon;
    private int gamesLost;
    private int gamesPlayed;
    private int gamesWon;
    private String icon;

    private boolean privateAccount;


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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public String getEndorsementIcon() {
        return endorsementIcon;
    }

    public void setEndorsementIcon(String endorsementIcon) {
        this.endorsementIcon = endorsementIcon;
    }

    public int getEndorsement() {
        return endorsement;
    }

    public void setEndorsement(int endorsement) {
        this.endorsement = endorsement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRatingIcon() {
        return ratingIcon;
    }

    public void setRatingIcon(String ratingIcon) {
        this.ratingIcon = ratingIcon;
    }

    public RankGroup[] getRatings() {
        return ratings;
    }

    public void setRatings(RankGroup[] ratings) {
        this.ratings = ratings;
    }

    public GameStats getQuickPlayStats() {
        return quickPlayStats;
    }

    public void setQuickPlayStats(GameStats quickPlayStats) {
        this.quickPlayStats = quickPlayStats;
    }

    public GameStats getCompetitiveStats() {
        return competitiveStats;
    }

    public void setCompetitiveStats(GameStats competitiveStats) {
        this.competitiveStats = competitiveStats;
    }

    public boolean isPrivateAccount() {
        return privateAccount;
    }

    public void setPrivateAccount(boolean privateAccount) {
        this.privateAccount = privateAccount;
    }
}

class RankGroup{
    private String group;
    private int tier;
    private String role;
    private String roleIcon;
    private String rankIcon;

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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleIcon() {
        return roleIcon;
    }

    public void setRoleIcon(String roleIcon) {
        this.roleIcon = roleIcon;
    }

    public String getRankIcon() {
        return rankIcon;
    }

    public void setRankIcon(String rankIcon) {
        this.rankIcon = rankIcon;
    }
}

class GameStats{
    private Awards awards;
    private Games games;
    private String season;


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

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}

class Games{
    private int played;
    private int won;


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
}

class Awards{
    private int cards;
    private int medals;
    private int medalsBronze;
    private int medalsSilver;
    private int medalsGold;

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
}
