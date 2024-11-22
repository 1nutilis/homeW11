public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("Skidish");
        Reader reader = new Reader("PandaKunfu");

        Book book1 = new Book("Java Programming", "SYGMA", "12345");
        Book book2 = new Book("Python Basics", "SYGMA", "67890");

        librarian.addBook(book1, library);
        librarian.addBook(book2, library);

        library.displayAllBooks();

        reader.borrowBook(book1);
        library.displayAllBooks();

        reader.returnBook(book1);
        library.displayAllBooks();
    }
}
