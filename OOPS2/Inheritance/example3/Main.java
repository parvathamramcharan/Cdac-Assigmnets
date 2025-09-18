//same like 2nd method  now part a in it
// now i wanna add extra parameter like bonus for techemp
//then ??

public class Main {
    public static void main(String[] args) {
        Emp e1 = new Emp(123,"ram","pune",100000);
        e1.dispEmp();    // 123 ram pune 100000.0 CDAC-HYD
        e1.calSalary();  // total salary : 112000.00000000001

        TechEmp te1 = new TechEmp(321, "raju", "chennai", 200000,10000);
        //addded bonus

        te1.dispEmp();   //321 raju chennai 200000.0 CDAC-HYD
        te1.calSalary();  //before // total salary : 224000.00000000003
                          //after  //total salary (with bonus): 234000.00000000003
        
        System.out.println("bonus : "+te1.getBonus());  // bonus : 10000

        //but  in total sal not getting updated


        
    }
}
