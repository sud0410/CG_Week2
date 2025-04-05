class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Published: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author("Psychology of Money", 2023, "Houston", "kasu puli");
        a.displayInfo();
    }
}
