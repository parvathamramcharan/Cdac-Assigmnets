//Static Method: Add a static method to the BankAccount class from the previous problem to
// calculate interest based on a given balance and interest rate. Also, implement a method to 
//display the account details including balance and interest earned.
class BankAccount {
   int accno;
   String accType;
   int balance;
   static int interestRate;
   static {
      interestRate = 5;
   }

   void set(int a, String t, int b) {
      this.accno = a;
      this.accType = t;
      this.balance = b;
   }

   static double calculateInterest(int b) { // here method is static due to method using static varaible
      return (b * interestRate) / 100.0;
   }

   void displayDetails() {
      double interest = calculateInterest(balance);
      System.out.println("Account Number : " + accno);
      System.out.println("Account Type : " + accType);
      System.out.println("Balance : " + balance);
      System.out.println("Interest Rate : " + interestRate + "%");
      System.out.println("Interest Earned : " + interest);

   }

}

public class Problem6 {
   public static void main(String[] args) {
      BankAccount b1 = new BankAccount();
      b1.set(12354, "savings", 2000);

      BankAccount b2 = new BankAccount();
      b2.set(45678, "Current", 8000);

      b1.displayDetails();
      b2.displayDetails();
   }
}