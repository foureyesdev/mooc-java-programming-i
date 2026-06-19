
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        int value = 1;

        if (number == 0) {
            value = 1;
        }

        for (int i = 1; i <= number; i++) {
            value *= i;
        }

        System.out.println("Factorial: " + value);
    }
}
