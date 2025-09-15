//Uses a constructor to set data during object creation

class Student{
    int roll;
    int age;
    String name;
    Student(int r,int a,String s){
        roll=r;
        age=a;
        name=s;
    }
    void display(){
        System.out.println(roll+" "+age+" "+name);
    }
}
public class sample3 {
    public static void main(String[] args) {
       Student s1=new Student(13,22,"Vinay");
       s1.display();
    }
}
