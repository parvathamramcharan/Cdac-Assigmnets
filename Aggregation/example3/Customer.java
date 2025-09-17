class Customer {
    int eid;
    String ename;
    String city;
    Bank bank;
    Address address;

    public Customer(int eid, String ename, String city, Bank bank, Address address) {
        this.eid = eid;
        this.ename = ename;
        this.city = city;
        this.bank = bank;
        this.address = address;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Info:");
        System.out.println("EID: " + eid);
        System.out.println("Name: " + ename);
        System.out.println("City: " + city);
        address.displayAddress();
        bank.displayBankDetails();
    }
}
