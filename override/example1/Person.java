public class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name= name;
        this.age=age;
    }
    void disp(){
        System.out.println(name+" "+age);
    }//setter method eliminated by constructor
    //getter method is elminated by toString();

    

}
//here this method is default which is called automatically
// so we are telling compiler that use my method when this method has called
// public String toString() {
//     return getClass().getName() + "@" + Integer.toHexString(hashCode());
// }
