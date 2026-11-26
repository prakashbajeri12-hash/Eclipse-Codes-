// This class belongs to the user-defined library package
package library;

public class Book {

    // private means these variables cannot be directly accessed
    // from another class
    private String bookname;
    private String ISBN;

    // protected member
    protected String publisher;

    // public member can be accessed from another package
    public String author;

    // Parameterized constructor
    // It receives book details when object is created
    public Book(String bookname, String ISBN,
                String publisher, String author) {

        this.bookname = bookname;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.author = author;
    }

    // Public method is used to display all book details
    public void displayBookDetails() {
        System.out.println("Book Name: " + bookname);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
    }

    // Private book name cannot be accessed directly
    // so we use this public method to get it
    public String getBookName() {
        return bookname;
    }

    // Same idea for ISBN
    public String getISBN() {
        return ISBN;
    }
}
