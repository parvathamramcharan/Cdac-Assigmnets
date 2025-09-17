import java.util.ArrayList;
public class Mentor {
    private String name;
    private int id;
    private ArrayList<Student> student;
     Mentor(String name , int id){
        this.name =name;
        this.id = id;
        this.student= new ArrayList<>();
     }
     public void addStudent(Student s){
      student.add(s);
     }
     @Override
     public String toString(){
        return name+" "+id+" "+student;  
     }
}
