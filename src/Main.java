import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();
    }
    public static int read() throws FileNotFoundException {
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        int counter = 0;
        while (s.hasNext()) {
            while (s.nextInt() != 0){

            }

        }
        return counter;
    }
}
