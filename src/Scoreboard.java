public class Scoreboard {

    public int team1Points = 0;
    public int team2Points = 0;
    public String team1 = "placeholder";
    public String team2 = "placeholder";
    public boolean isTeam1Active = true;

    public Scoreboard(String team1, String team2){
     this.team1 = team1;
     this.team2 = team2;
    }

    public void recordPlay(int a){
        if (isTeam1Active)
            team1Points += a;
        else
            team2Points += a;
    }

    public String getscore(){
        return team1Points + " - team 1" + team2Points + " - team 2";

    }
}
