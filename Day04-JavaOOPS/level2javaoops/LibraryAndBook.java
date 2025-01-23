import java.util.ArrayList;
class Book {
    private String title;
    private String author;

    //Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }

    //Getter for author
    public String getAuthor() {
        return author;
    }
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    //Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    //Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    //Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in " + name );
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String getName() {
        return name;
    }
}

public class LibraryAndBook{
    public static void main(String[] args) {
        //Creating some book object
        Book book1 = new Book("The Great", "Alice");
        Book book2 = new Book("1984", "Orwell");
        Book book3 = new Book("Once upon a time", "Ajay devgan");

        //Creating library object
        Library library1 = new Library("Central Library");
        Library library2 = new Library("city Library");

        //Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        //Displaying books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
