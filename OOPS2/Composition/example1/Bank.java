class Bank {
    long accno;
    String acctype;
    double bal;
    String branch;

    public Bank(long accno, String acctype, double bal, String branch) {
        this.accno = accno;
        this.acctype = acctype;
        this.bal = bal;
        this.branch = branch;
    }

    // Method to calculate Simple Interest: SI = (P * R * T)/100
    public double calculateSI(double rate, int time) {
        return (bal * rate * time) / 100;
    }

    public void displayBankDetails() {
        System.out.println("Bank Details:");
        System.out.println("Account No: " + accno);
        System.out.println("Account Type: " + acctype);
        System.out.println("Balance: " + bal);
        System.out.println("Branch: " + branch);
    }
}
