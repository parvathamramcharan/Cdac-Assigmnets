
public class Emp{
     private int eid;
     private String name;
     private String  city;
     protected double basic;
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

     //for 2nd way to pass to pass this basic
     public double getBasic(){
         return basic;
     }
}
