public class Main {
    public static void main(String[] args) {
        Emp e1 = new Emp(123,"ram","pune",100000);
        e1.dispEmp();    // 123 ram pune 100000.0 CDAC-HYD
        e1.calSalary();  // total salary : 112000.00000000001

        TechEmp te1 = new TechEmp(321, "raju", "chennai", 200000);
        te1.dispEmp();   //321 raju chennai 200000.0 CDAC-HYD
        te1.calSalary();  //total salary : 224000.00000000003
        
    }
}
