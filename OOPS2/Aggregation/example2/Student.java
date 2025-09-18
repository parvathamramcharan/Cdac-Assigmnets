public class Student{
    private String name;
    private int rollno;
    private String course;
    Student(String name,int rollno,String course){
        this.name= name;
        this.rollno =rollno;
        this.course=course;
    }
    @Override
    public String toString(){
        return name+" "+rollno+" "+course;
    }
}
