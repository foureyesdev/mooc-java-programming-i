
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        ArrayList<Integer> ages = new ArrayList<>();

        String oldestName = "";
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(",");

            int age = Integer.valueOf(splited[1]);
            String name = splited[0];

            ages.add(age);
            names.add(name);

            for (int i = 0; i < ages.size(); i++) {
                int ageValue = ages.get(i);

                if (oldestAge < ageValue) {
                    oldestAge = ageValue;
                    oldestName = names.get(i);
                }
            }
        }

        if (!(ages.isEmpty() && names.isEmpty())) {
            System.out.println("Name of the oldest: " + oldestName);
        }
    }
}
