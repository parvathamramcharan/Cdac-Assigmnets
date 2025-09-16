//A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class.
class Student{
    String name;
    int age;
    String course;
    Student(String name,int age,String course){
        this.name =name;
        this.age= age;
        this.course= course;
        System.out.println("hello");
    }
    Student(Student s){
        this.name = s.name;
        this.age= s.age;
        this.course = s.course;
        System.out.println("hello copy from constructor       ");
    }
}
public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("ram", 21, "dac");
        Student s2 = new Student(s1);
    }
}
