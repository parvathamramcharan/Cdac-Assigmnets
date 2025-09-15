//Composition and Aggregation:
//Create a class Address with attributes street, city, and state. 
//Then create a class Person with attributes name and an Address object. 
//Demonstrate how to use com Write a Java class representing a Student.
//Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers.
//Provide getter and setter methods to access and modify these 
//attributes position to model the relationship between a person and their address


// Address class
class Address {
    String street;
    String city;
    String state;

    Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}

// Person class
class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

// Student class with encapsulation
class Student {
    private String name;
    private int age;
    private double gpa;
    private Person person;

    Student(String name, int age, double gpa, Person person) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.person = person;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public Person getPerson() {
        return person;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // Display method
    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Person Name: " + person.name);
        System.out.println("Street: " + person.address.street);
        System.out.println("City: " + person.address.city);
        System.out.println("State: " + person.address.state);
    }
}

// Main class
public class Problem9 {
    public static void main(String[] args) {
        // Create Address object
        Address addr = new Address("MG Road", "Hyderabad", "Telangana");

        // Create Person object
        Person person = new Person("Ram Charan", addr);

        // Create Student object
        Student student = new Student("Ram Charan", 21, 9.1, person);

        // Display using getters
        System.out.println("Using getters:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Person Name: " + student.getPerson().name);
        System.out.println("Street: " + student.getPerson().address.street);
        System.out.println("City: " + student.getPerson().address.city);
        System.out.println("State: " + student.getPerson().address.state);

        System.out.println("\nModifying values using setters...");

        // Update values using setters
        student.setName("Sivya");
        student.setAge(20);
        student.setGpa(9.5);
        student.getPerson().name = "Sivya"; // Directly updating Person name
        student.getPerson().address.street = "Banjara Hills";
        student.getPerson().address.city = "Hyderabad";
        student.getPerson().address.state = "Telangana";

        // Display updated details
        System.out.println("\nAfter updates:");
        student.displayStudent();
    }
}
