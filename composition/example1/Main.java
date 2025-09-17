
public class Main {
    public static void main(String[] args) {
        Address addr = new Address("GreenVillage", "Maple Street", 123456, "12B");
        Bank bank = new Bank(9876543210L, "Savings", 50000.0, "Downtown Branch");
        Customer cust = new Customer(101, "John Doe", "Metropolis", bank, addr);

        cust.displayCustomerInfo();

        double si = cust.bank.calculateSI(5, 2);  // rate=5%, time=2 years
        System.out.println("Simple Interest on balance: " + si);
    }
}
