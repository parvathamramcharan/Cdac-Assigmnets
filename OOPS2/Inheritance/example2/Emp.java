//2nd method  , what if we set members via constructot then we need manual
//usgae of super keyword
public class Emp{
     private int eid;
     private String name;
     private String  city;
     private double basic;
     private static String org="CDAC-HYD";
     //getter
     Emp(int eid,String name,String city,double basic){
        this.eid= eid;
        this.name=name;
        this.city=city;
        this.basic=basic;
     }
     //getter
     public void dispEmp(){
          System.out.println(eid+" "+name+" "+city+" "+basic+" "+org);
     }
     public void calSalary(){
        double total =  (basic)*(0.12+0.8+0.2);
        System.out.println("total salary : "+total);
     }
}
