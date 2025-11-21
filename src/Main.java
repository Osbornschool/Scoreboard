import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    String Team1 = "PlaceHolder";
    String Team2 = "PlaceHolder2";

    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList<String> teams = new ArrayList<String>();
//        System.out.println(teams);
//        teams.add("Red");
//        teams.add("Orange");
//        System.out.println(teams);
//        teams.remove(0);
//        System.out.println(teams);
    }
    public static int read() throws FileNotFoundException {
        String[] teams = new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        System.out.println(teams[0]);
        int[] points = new int[7];
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        int counter = 0;
        while (s.hasNext()){
            String Team1 = s.next();
            String Team2 = s.next();
            while (s.next().equals(String.valueOf(s.nextInt()))){
                for(int i = 0; i < teams.length; i++){
                    if (teams[i].equals(s.next())){

                    }
            }

            }
        }
            return 0;
    }
}
