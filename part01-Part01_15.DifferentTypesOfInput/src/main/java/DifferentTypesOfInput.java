
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        int integerNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatingPointNumber = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integerNumber);
        System.out.println("You gave the double " + floatingPointNumber);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
