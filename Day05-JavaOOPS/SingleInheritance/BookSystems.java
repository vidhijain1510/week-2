/*Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
 */

//Superclass Book with attributes like title and publicationYear.
class Book{
    protected String title;
    protected int publicationYear;

    //Constructor
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //Method displayInfo() to show details of the book
    void displayInfo(){
        System.out.println("Title: " + title + " | Publication Year: " + publicationYear);
    }
}
//Subclass Author with additional attributes like name and bio.
class Author extends Book{
    protected String authorName;
    protected String bio;

    //Constructor
    Author(String title, int publicationYear, String authorName, String bio){
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    //Method displayInfo() to show details of the Author
    @Override
    void displayInfo(){
        System.out.println("Titlt: " + title + " | Publication Year: " + publicationYear + " | Author name: " + authorName + " | Bio" + bio);
    }
}

public class BookSystems{
    public static void main(String[] args) {
        Book author = new Author("The Great", 1992, "George", "This is a great book.");
        author.displayInfo();
    }
}


 