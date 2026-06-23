import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, pages, pubYear);

            books.add(book);
        }

        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();

        for (Book book : books) {
            if (info.equals("everything")) {
                System.out.println(book);
            }

            if (info.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
