import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    String Team1 = "PlaceHolder";
    String Team2 = "PlaceHolder2";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();
    }
    public static int read() throws FileNotFoundException {
        String[] teams = new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        int[] points = new int[7];
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        int counter = 0;
        while (s.hasNext()){
            String Team1 = s.next();
            String Team2 = s.next();
            while (s.next().equals(String.valueOf(s.nextInt()))){
                for(int i = 0; i < 60; i++){
                    if (Team1.equals(teams.get())
                        iterator
            }

            }
        }
            return 0;
    }
}
