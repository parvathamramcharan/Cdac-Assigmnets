public class sample5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //if(a&&b){ } compile error because && || applies for only true or false

        //if(1){..} // compile error because if appiles on only boolean
                    //but in c/c++ we can write
        
        a=20;
        System.out.println(a++); // 20 , but a = 21
        System.out.println(++a); // 21+1 => 22

       // System.out.println(++5);
        // System.out.println(5++);  //can't apply incre/decre on constants
       
        final  int m = 10;
       // System.out.println(m++); // error  , final value cant update
    }
}
