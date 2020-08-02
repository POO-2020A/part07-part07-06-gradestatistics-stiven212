
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statis = new Statistics();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int values = Integer.valueOf(scanner.nextLine());
            if (values == -1) {
                break;
            }
            if (values >= 0 && values <= 100) {
                statis.add(values);

            }

        }
        System.out.println(statis);

    }
}
