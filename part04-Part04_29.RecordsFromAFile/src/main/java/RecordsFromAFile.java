
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {

            while (scan.hasNextLine()) {
                String data = scan.nextLine();

                String[] splitedData = data.split(",");
                String name = splitedData[0];
                int age = Integer.valueOf(splitedData[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
