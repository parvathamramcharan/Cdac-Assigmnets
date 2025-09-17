//2.Create a class Person with attributes name , age  and country .Implement methods to set and get this attributes .
//Create an object of this class , set its attributes and print out the details.
class Person{
    String name;
    int age;
    String Country;
    public void set(String n,int a,String c){
        this.name=n;
        this.age=a;
        this.Country=c;
    }
    public void get(){
        System.out.println(name+" "+age+" "+Country+" ");
    }

}
public class Problem2 {
    public static void main(String[] args) {
        Person p=new Person();
        p.set("Vijay",25,"India");
        p.get();
    }
}

