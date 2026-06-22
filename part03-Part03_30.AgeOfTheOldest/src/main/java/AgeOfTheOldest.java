
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();
        int oldestAge = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(",");

            int age = Integer.valueOf(splited[1]);

            ages.add(age);

            for (int a : ages) {
                if (oldestAge < a) {
                    oldestAge = a;
                }
            }
        }

        if (!ages.isEmpty()) {
            System.out.println("Age of the oldest: " + oldestAge);
        }
    }
}
