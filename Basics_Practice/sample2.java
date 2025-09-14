public class sample2 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);       // 3
        System.out.println(a + "b"); // 3b
        System.out.println(a + 'b'); // 3 + 98 => 101
        System.out.println('b' + a); // 98 + 3  =>101
        System.out.println('a'+'b'); // 97 + 98 =>195
        //System.out.println(a+b);   //Compile Error
        System.out.println('a'+"b"); // ab

        
    }
}
