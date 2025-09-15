//No constructor, using a Details() method to set data
class Student{
    int roll;
    String name;
    String Course;
    static String org="C-Dac HYD";
    void display(){
        System.out.println(roll+" "+name+" "+org);
    }
    void Details(int r,String s1 , String s2){
        roll=r;
        name=s1;
        Course=s2;
        display();
    }
}
public class sample2 {
    public static void main(String[] args) {
      Student s=new Student();
      
      s.Details(32,"Ram","DAC");
      // 32 Ram C-Dac HYD
        
    } 
}
