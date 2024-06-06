package S10_Generics;

import java.util.ArrayList;
import java.util.List;


record Affiliation(String name, String type, String countrycode){
    @Override
    public String toString() {
        return name + " (" + type + " in " + countrycode + ")";
    }
}

public class Team<T extends Player, S> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();

    int totalWins = 0;
    int totalLoses = 0;
    int totalTies = 0;

    private S affiliation;

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster: ");
        System.out.println( (affiliation == null ? "" : " AFFILIATION: " + affiliation ) );
//        System.out.println(teamMembers);
        for (T t : teamMembers){
            System.out.println(t.name());
        }
    }

    public int ranking(){
        return (totalLoses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        }else{
            totalLoses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}

