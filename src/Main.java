import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    // actually exercise 2
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int counter = 0;
        boolean stop1 = false;
        boolean stop2 = false;
        System.out.println ("part 1:");

        while (!stop1)
        {
            String word = scanner.next();
            if (word.equals("!")) {
                stop1 = true;
            }
            else if (!word.equals("!") && !stop1) {
                list.add(word);
            }
        }
        System.out.println ("part 2:");
        while (!stop2) {
            String word = scanner.next();
            if (word.equals("!")) {
                stop2 = true;
            }
            else if (list.contains(word)) {
                System.out.println("hit");
            }
        }
    }
}