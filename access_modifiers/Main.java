public class Main {
    public static void main(String[] args) {
        Person p = new Person("raju",10);
        System.out.println(p); //ram 30
        p.disp();  //raju
        //since disp() method is public so  we got answer
        // if disp() is private we cant access
    }
}
