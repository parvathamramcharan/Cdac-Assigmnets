import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         Student s1 = new Student("ram",67,"dac");
        Student s2 = new Student("raju",45,"dbda");
        Student s3 = new Student("sita",90,"desd");
        Student s4 = new Student("bheem",78,"dac");
        Student s5 = new Student("mahesh",23,"desd");
        
        Mentor m = new Mentor("Harshith", 123);
        m.addStudent(s1);
        m.addStudent(s2);
        m.addStudent(s3);
        m.addStudent(s4);
        m.addStudent(s5);
        System.out.println(m);
    }
}
