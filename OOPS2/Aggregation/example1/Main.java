public class Main {
    public static void main(String[] args) {
        Address addr =new Address(4113, "Temple road", "mustikuntla", 507204);
        Person p = new Person("ram", 21, addr);
        System.out.println(p);
    }
}
