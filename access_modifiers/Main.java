//1.private -> data members  and also to nested classes
//2. default -> (un specified) -> accessble with in our package; applied to everything
//3.protected -> (default+ inheritence)=> parent class members accessed by class class members
//4.public -> applied to class ,constructor,data...
public class Main {
    public static void main(String[] args) {
        Person p = new Person("raju",10);
        System.out.println(p); //ram 30
        p.disp();  //raju
        //since disp() method is public so  we got answer
        // if disp() is private we cant access
    }
}
