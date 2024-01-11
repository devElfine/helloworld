public class Lib {
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
