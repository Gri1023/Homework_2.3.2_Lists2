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
        boolean stop = false;
        System.out.println ("part 1:");

        while (!scanner.hasNext("!") || !stop)
        {
            String word = scanner.next();
            if (word.equals("!")) {
                stop = true;
                System.out.println("changed to part 2");
            }

            // part 1
            else if (!word.equals("!") && !stop) {
                list.add(word);
            }

            // part 2
            if (stop) {
                if (list.contains(word)) {
                    System.out.println("hit");
                }
            }
        }
    }
}