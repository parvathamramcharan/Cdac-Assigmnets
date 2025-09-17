import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("ram",67,"dac");
        Student s2 = new Student("raju",45,"dbda");
        Student s3 = new Student("sita",90,"desd");
        Student s4 = new Student("bheem",78,"dac");
        Student s5 = new Student("mahesh",23,"desd");
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
        Mentor m = new Mentor("Harshith", 123, arr);
        System.out.println(m);
    }
}
