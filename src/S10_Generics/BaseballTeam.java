package S10_Generics;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private String teamName;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    int totalWins = 0;
    int totalLoses = 0;
    int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);
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

