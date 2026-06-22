
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(" ");
            int lastIndex = splited.length - 1;
            String lastWord = splited[lastIndex];
            System.out.println(lastWord);
        }
    }
}
