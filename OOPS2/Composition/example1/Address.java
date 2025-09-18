class Address {
    String village;
    String street;
    int pincode;
    String hno;

    public Address(String village, String street, int pincode, String hno) {
        this.village = village;
        this.street = street;
        this.pincode = pincode;
        this.hno = hno;
    }

    public void displayAddress() {
        System.out.println("Address:");
        System.out.println("H.No: " + hno + ", Street: " + street);
        System.out.println("Village: " + village + ", Pincode: " + pincode);
    }
}
