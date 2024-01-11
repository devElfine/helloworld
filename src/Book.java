import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int pubYear;
    public Book(String title, Author author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPubYear() {
        return pubYear;
    }
    public void setPubYear( int pubYear) {
        this.pubYear = pubYear;
    }
    @Override
    public String toString () {
        return "Title [" + this.getTitle() + "] Author [" + this.getAuthor().toString() + "] " + " Year [" +
                this.getPubYear() + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubYear == book.pubYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pubYear);
    }
}
