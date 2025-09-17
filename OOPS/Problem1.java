// 1.Define a class of type Student that has rollno , age and name  as private data members.Define SetData() and GetData() 
//as public member funtions with appropriate functionality.write a program that declares 2 students objects , 
//initializes the first at run time and second by reading from console and then displays both students data.
import java.util.*;
class Student{
    private int  rollno;
    private int age;
    private String name;
    public void SetData(int r ,int a , String n){
        rollno= r;
        age=a;
        name = n;
    }
    public void GetData(){
        System.out.println(rollno+" "+age+" "+name);
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student s1 = new Student();
        s1.SetData(67, 22, "ram");
        //s1.rollno = 67;  // this cant be accsses as roll no is private , if want to access  use given getdata methods inside(encapsulation)

        Student s2 = new Student();
        int rollno = scanner.nextInt();
        int age = scanner.nextInt();
        String name = scanner.next();
        s2.SetData(rollno, age, name);   


        s1.GetData();   //67 22 ram
        s2.GetData();  //60 21 vivek
        scanner.close();


    }
}


