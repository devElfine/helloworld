// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Author {
    private String firstName;
    private String surName;
    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    public String getAuthorName() {
        return firstName;
    }
    public String getAuthorSurName() {
        return surName;
    }
//    @Override:
    public String toString() {
        return firstName + " " + surName;
    }
    public boolean equals(Author sample) {
        return (this.getAuthorName().equalsIgnoreCase(sample.getAuthorName()) &&
                this.getAuthorSurName().equalsIgnoreCase(sample.getAuthorSurName()));
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, surName);
    }
}
class Book {
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
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
//    @Override:
    public String toString() {
        return "Title [" + this.getTitle() + "] Author [" + this.getAuthor().toString() + "] " + " Year [" +
                this.getPubYear() + "]";
    }
    public boolean equals(Book sample) {
        return (this.getTitle().equalsIgnoreCase(sample.getTitle()) &&
                this.getPubYear() == this.getPubYear());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, pubYear);
    }
}
class Lib {
    static Author[] authors = null;
    static Book[] books = null;
    private static void printCatalogue() {
        int k = books.length;
        for (int i = 0; i < k; i++) {
            System.out.println(books[i].toString());
        }
    }
    public Lib() {
        authors = new Author[] {
                new Author("Victor", "Pelyevin"),
                new Author("Lewis", "Carroll")
        };
        books = new Book[] {
                new Book("Alice in Wonderland", authors[1], 1865),
                new Book("S.N.A.F.F.", authors[0], 2010)
        };
    }
    public static void main() {
        // Выводим список книг
        printCatalogue();
        System.out.println();
        // Меняем год издания книги В.Пелевина
        books[1].setPubYear(2011);
        printCatalogue();
    }
}
public class Main {
    public static void main(String[] args) {
        //--hw12-objects-and-classes--
        //Task 1
        Lib Lib = new Lib();
        Lib.main();
    }
}