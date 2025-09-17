public class Main {
    public static void main(String[] args) {
        Person p = new Person("ram", 20);
        //System.out.println(p);  //Person@2f92e0f4  if not toString called or overridden
        System.out.println(p.toString()); //ram 30
        System.out.println(p);  //ram 30 
    }
}
