
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                total += 1;
                sum += number;
            }
        }

        if (total == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = 1.0 * sum / total;
            System.out.println(avg);
        }
    }
}
