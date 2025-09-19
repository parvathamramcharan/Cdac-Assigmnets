package problem6;

public class Driver {

	public static void main(String[] args) {
			 // Creating Employee object
        Employee emp = new Employee();
        emp.name = "Ram Charan";
        emp.age = 25;
        emp.phoneNumber = "9876543210";
        emp.address = "Hyderabad";
        emp.salary = 50000;
        emp.specialization = "Software Development";
        emp.displayDetails();

        // Creating Manager object
        Manager mgr = new Manager();
        mgr.name = "Suresh Kumar";
        mgr.age = 40;
        mgr.phoneNumber = "9123456780";
        mgr.address = "Vijayawada";
        mgr.salary = 85000;
        mgr.department = "IT Department";
        mgr.displayDetails();
	}

}
