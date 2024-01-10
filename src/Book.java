public class Book {
    private String title;
    private Author author;
    private int pubYear;
    public Book(String title, Author author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
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
