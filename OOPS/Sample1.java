class Student{
    int rollno;    // primitive datatype  + instance variable
    String name;   //reference datatype  + instance variable
    static String org ="CDAC HYD";  //reference datatype  + class varible
    // IF static String org;(not initialized) // we get null
    
    void Details(int r ,String n){
        rollno=r;
        name=n;
        System.out.println("hello");
    }
     void display(){                    // non-static method
        System.out.println(rollno+" "+name+" "+org);
    }
}
public class sample1{
    public static void main(String[] args) {
        Student s =  new Student();
        s.display(); // 0 null CDAC HYD
        s.Details(51,"raju");  // 51 raju CDAC HYD
        System.out.println(s.rollno);
        s.display();
        s.Details(10,"vivek");
        s.display();

    }
}

// if we wrap  data members and methods inside a class , even if they are public or private then this form encapsulation concept;

// after in this encapsulation, if all members are public we can direct access members in outside(within main class also)

//if any thing is  private , we cannot access members outside directly
