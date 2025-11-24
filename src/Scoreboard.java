public class Scoreboard {

    public int score1;
    public int score2;
    public String team1;
    public String team2;
    public boolean team1Active;

    public Scoreboard(String t1, String t2) {
        team1 = t1;
        team2 = t2;
        score1 = 0;
        score2 = 0;
        team1Active = true;
    }
    public void recordPlay(int points) {
        if (points > 0) {
            if (team1Active)
                score1 += points;
             else
                score2 += points;
        } else
            team1Active = !team1Active;
    }

    public String getscore(){
        return score1 + " - team 1" + score2 + " - team 2";
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
}
