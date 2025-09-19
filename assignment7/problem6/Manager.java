


package problem6;

public class Manager extends Member {
    String department;

    // Method to display manager details
    void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println("--------------------------------");
    }
}
