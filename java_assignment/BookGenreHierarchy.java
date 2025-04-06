// Abstract class representing books in general
abstract class Book {
    String my_title;

    public Book(String title) {
        this.my_title = title; // Fixed assignment of title to field
    }

    // Abstract method that must be implemented by subclass
    abstract void describe();

    // Concrete method
    void read() {
        System.out.println("Reading: " + my_title);
    }
}

// Interface for defining genre behavior
interface Genre {
    void defineGenre();
}

// Concrete class representing Fiction books
class Fiction extends Book implements Genre {
    public Fiction(String title) {
        super(title);
    }

    @Override
    void describe() {
        System.out.println(my_title + " is a story that I made up.");
    }

    @Override
    public void defineGenre() {
        System.out.println(my_title + ", thus it belongs to the fiction genre.");
    }
}

// Concrete class representing Non-Fiction books
class NonFiction extends Book implements Genre {
    public NonFiction(String title) {
        super(title);
    }

    @Override
    void describe() {
        System.out.println(my_title + " is based on real events.");
    }

    @Override
    public void defineGenre() {
        System.out.println(my_title + ", thus it belongs to the non-fiction genre.");
    }
}

// Test class
 public class BookGenreHierarchy {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Game of Thrones");
        NonFiction nonFictionBook = new NonFiction("The Bible");

        fictionBook.describe();
        fictionBook.defineGenre();
        fictionBook.read();

        nonFictionBook.describe();
        nonFictionBook.defineGenre();
        nonFictionBook.read();
    }
}
