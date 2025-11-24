import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] teams = new String[]{"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        int[] wins = new int[7];

        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);

        while (s.hasNext()) {
            String team1 = s.next();
            String team2 = s.next();
            Scoreboard game = new Scoreboard(team1, team2);
            while (s.hasNextInt()) {
                int pointsEarned = s.nextInt();
                game.recordPlay(pointsEarned);
            }
            int score1 = game.getScore1();
            int score2 = game.getScore2();
            if (score1 > score2) {
                int index = findTeamIndex(teams, team1);
                wins[index]++;
            } else if (score2 > score1) {
                int index = findTeamIndex(teams, team2);
                wins[index]++;
            }
        }
        s.close();
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i] + ": " + wins[i]);
        }
    }
    public static int findTeamIndex(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
