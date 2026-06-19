
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
