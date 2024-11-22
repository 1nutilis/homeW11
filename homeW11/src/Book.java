public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public void markAsLoaned() {
        isAvailable = false;
    }

    public void markAsAvailable() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' + ", isAvailable=" + isAvailable + '}';
    }
}
