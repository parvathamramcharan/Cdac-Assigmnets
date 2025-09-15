 class Person{
    String name ;
    int roll;
    

 }
public class Sample4 {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.roll= 10;
        s1.name="ram charan";

        Person s2 = new Person();
        s2.roll= 10;
        s2.name="ram charan";
        System.out.println(s1.roll+"  "+s1.name);
        System.out.println(s2.roll+"  "+s2.name);
    }
}
// if we write this like everything is fine but it lacks code reusabilty and encapsulation;
