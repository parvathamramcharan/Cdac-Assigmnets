public class TechEmp  extends Emp{
    private double bonus;
    TechEmp(int eid,String name,String city,double basic,double bonus){
    super(eid,name ,city,basic);
    this.bonus=bonus;
    };


    public double getBonus(){
        return bonus;
    }
    @Override
    public void calSalary(){
        //double total = basic * (0.12 + 0.8 + 0.2) + bonus;  
        //compile error as basic is private;
        //2 ways to solve
        //1.change private to protected 
        //2.get through separate method
        double total = getBasic() * (0.12 + 0.8 + 0.2) + bonus;;
        System.out.println("total salary (with bonus): " + total);
    }
}
