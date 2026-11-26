import java.util.Scanner;

// Import Book class from our user-defined library package
import library.Book;

public class LibraryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take book details from user
        System.out.print("Enter Book Name: ");
        String bookname = sc.nextLine();

        System.out.print("Enter ISBN: ");
        String ISBN = sc.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        // Create Book object using parameterized constructor
        Book b = new Book(bookname, ISBN, publisher, author);

        System.out.println("\nBook Details:");

        // Public method can be accessed from outside the package
        b.displayBookDetails();

        // Private data is accessed through public getter methods
        System.out.println("\nBook Name using getter: "
                + b.getBookName());

        System.out.println("ISBN using getter: "
                + b.getISBN());

        // author is public, so we can access it directly
        System.out.println("Author using public member: "
                + b.author);

        sc.close();
    }
}