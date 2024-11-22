import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.markAsLoaned();
            System.out.println(name + " borrowed " + book);
        } else {
            System.out.println(book + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.markAsAvailable();
            System.out.println(name + " returned " + book);
        } else {
            System.out.println(name + " doesn't have this book.");
        }
    }
}
