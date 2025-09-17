import java.util.Date;
public class test{
    public static void main(String[] args) {
        System.out.println(new java.util.Date());  //Wed Sep 17 15:30:50 IST 2025
        //or 
        // java.util.Date d = new java.util.Date();
        Date d = new Date();
        System.out.println(d);     //Wed Sep 17 15:30:50 IST 2025
        System.out.println(d.toString());  //Wed Sep 17 15:30:50 IST 2025

        /// here toString() is redefined or overriden in Date package
    }
}
