//Inhertence : acquring properties of parent class(except private and constructors)  by the child class
//method1 : if no constructor then everything happen automatically
public class Emp{
    private int eid;
    private String ename;
    private double basic;
    private String city;
    private static String org= "CDAC-HYD";
    //setter
    public void setEmp(int eid,String ename,double basic ,String city){
      this.eid=eid;
      this.ename=ename;
      this.basic = basic;
      this.city= city;
    }
    //getter
    public void dispEmp(){
        System.out.println(eid+" "+ename+" "+basic+" "+city+" "+org);
    }
    //calculate salary
    public void calSalary(){
        double salary = basic*(0.3+0.41+5.1);
        System.out.println("Total Salary : "+salary);
    }
}
