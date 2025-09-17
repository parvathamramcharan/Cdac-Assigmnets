// write Java program that models a Library. 
//Create classes for Library, Book, and Author. 
// Ensure that the Library class aggregates a collection of Book objects, 
// and each Book object has an aggregation relationship with an Author object.
import java.util.List;
import java.util.ArrayList;
class Library{
    String Name;
    String Address;
    List<Book> books; // aggregation of Books
    Library(String N,String A ){
        this.Name = N;
        this.Address=A;
        this.books = new ArrayList<>();  // initialize empty list
    }
    public void addBook(Book b ){
        books.add(b);
    }
    void displayDetails(){
        System.out.println("Library name : "+ Name);
        System.out.println("Address : "+ Address);
        System.out.println("Books Available:");
        for (Book b : books) {
            System.out.println("  Book Title : " + b.Title);
            System.out.println("  ISBN       : " + b.ISBN);
            System.out.println("  Author     : " + b.author.Name);
            System.out.println("  DOB        : " + b.author.DateofBirth);
            System.out.println("  Nationality: " + b.author.Nationality);
            System.out.println("----------------------------");
        }
    }
}
class Book{
    String Title;
    Author author;
    int ISBN;
    Book(String t , Author a , int n){
        this.Title = t;
        this.author = a;
        this.ISBN= n;
    }
}
class Author{
    String Name;
    String DateofBirth;
    String Nationality;
    Author(String n , String d , String c){
        this.Name = n;
        this.DateofBirth = d;
        this.Nationality = c;
    }
    
}

public class Problem10 {
    public static void main(String[] args) {
        Author auth1 = new Author("Ram", "07/11/2002", "Indian");
        Author auth2 = new Author("Charan", "15/05/1999", "Indian");

        Book bk1 = new Book("My Life", auth1, 123456);
        Book bk2 = new Book("Journey of Dreams", auth2, 987654);

        Library lb = new Library("Genius Library", "Hyderabad");

        lb.addBook(bk1);
        lb.addBook(bk2);
        lb.displayDetails();



    }
}
