//Write a program to find the greatest common divisor (GCD) of two numbers.
public class program14 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);   // 5 15
        int num2 = Integer.parseInt(args[1]);
        if(num1==0){
            System.out.println(num2);
        }else if(num2==0){
            System.out.println(num1);
        }
        else{
            while( num1!=num2){
                if(num1 > num2){
                    num1 =  num1-num2;
                }
                else{
                    num2= num2-num1;
                }
            }
            System.out.println(num1);  // num1 and num2 are equal
        }
    }
}
