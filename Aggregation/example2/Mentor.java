import java.util.*;
public class Mentor {
    private String name;
    private int id;
    private ArrayList<Student> student;
    Mentor(String name,int id,ArrayList<Student> student){
        this.name = name;
        this.id= id;
        this.student= student;
    }
    @Override
    public String toString(){
        return name+" "+id+" "+student;
    }
}
