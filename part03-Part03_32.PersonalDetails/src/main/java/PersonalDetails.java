
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(",");
            String name = splited[0];
            int birthYear = Integer.valueOf(splited[1]);

            names.add(name);
            birthYears.add(birthYear);

            for (String str : names) {
                if (longestName.length() < str.length()) {
                    longestName = str;
                }
            }
        }

        System.out.println("Longest name: " + longestName);

        int sum = 0;
        for (Integer year : birthYears) {
            sum += year;
        }

        double avg = 1.0 * sum / birthYears.size();

        System.out.println("Average of the birth years: " + avg);
    }
}
