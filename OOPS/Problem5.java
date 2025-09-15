//5.Static Variable: Create a class BankAccount with accno,accType,Balance and static variable interestRate.
//Initialize it using a static block. Implement methods to deposit and withdraw funds
// Create objects and display details.
class BankAccount {
    int accno;
    String accType;
    int Balance;
    static int interestRate;

    
    static {
        interestRate = 5;
    }

    void set(int accno, String accType, int Balance) {
        this.accno = accno;
        this.accType = accType;
        this.Balance = Balance;
    }

    
    void get() {
        System.out.println("Account No: " + accno);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + Balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("------------------------------");
    }


    void deposit(int amount) {
        this.Balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + Balance);
        System.out.println("------------------------------");
    }

    
    void withdraw(int amount) {
        if (amount > Balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.Balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + Balance);
        }
        System.out.println("------------------------------");
    }
}
public class Problem5 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.set(3214, "Savings", 5000);
        b1.get();

        BankAccount b2 = new BankAccount();
        b2.set(2564, "Current", 10000);
        b2.get();

        b1.deposit(1000);
        b2.withdraw(3000);
    }
}

