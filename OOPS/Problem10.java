// write Java program that models a Library. 
//Create classes for Library, Book, and Author. 
// Ensure that the Library class aggregates a collection of Book objects, 
// and each Book object has an aggregation relationship with an Author object.
class Library{
    String Name;
    String Address;
    Book book;
    Library(String N,String A,Book b ){
        this.Name = N;
        this.Address=A;
        this.book = b;
    }
    void displayDetails(){
        System.out.println("Library name : "+ Name);
        System.out.println("Address : "+ Address);
        System.out.println("book name : "+book.Title);
        System.out.println("Book ISBN number : "+book.ISBN);
        System.out.println("book author name : "+book.author.Name);
        System.out.println("author dateofbirth : "+book.author.DateofBirth);
        System.out.println("author Natinality : "+book.author.Nationality);
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
        Author auth = new Author("ram", "7/11//2002", "Indian");

        Book bk = new Book("my Life",auth,123456);

        Library lb = new Library("genius library", "hyderbad", bk);
        lb.displayDetails();



    }
}
