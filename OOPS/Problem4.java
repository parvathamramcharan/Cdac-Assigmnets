//4.Using this : Modify the person class to include a method that displays the name and age of the object .
//Use this keyword to differentiate between class variables and method parameters .
//Implement a method to campare two Person objects based on their age

 class Person {
    int age;
    String name;

   
    void set(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    // Compare method that compares current object with another Person
    void Compare(Person other) {    //here other is not keyword , we can use any another name also like 
        if (this.age > other.age) {                      //this refers to p1 (the object that called the method)
                                                         //other refers to p2 (the object passed in)
            System.out.println(this.name + " is older than " + other.name);
        } else if (this.age < other.age) {
            System.out.println(other.name + " is older than " + this.name);
        } else {
            System.out.println(this.name + " and " + other.name + " are of the same age");
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.set(21, "Raju");

        Person p2 = new Person();
        p2.set(29, "Rahul");

        p1.display();
        p2.display();

        // Compare their ages
        p1.Compare(p2);  // THIS is user defined method
    }
}
