public class Main {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setEmp(123,"ram",100000,"hyd");
        e1.calSalary();
        e1.dispEmp();    // Total Salary : 581000.0  123 ram 100000 hyd CDAC-HYD


        TechEmp te1 =new TechEmp();
        te1.setEmp(321,"raju",200000,"pune");
        te1.calSalary();
        te1.dispEmp(); // Total Salary : 1162000.0 321 raju 200000.0 pune CDAC-HYD

    }
}
