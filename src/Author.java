public class Author {
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
