public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println(name + " added " + book);
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println(name + " removed " + book);
    }
}
