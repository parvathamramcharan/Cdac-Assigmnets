//Write a program to calculate the power of a number using a loop.
public class program13 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int exp = Integer.parseInt(args[1]);
        int  result=1 ; //anything power is one
        for(int i =1 ; i <=exp ;i++){
             result =  result*num;
        }
        System.out.println(result);

    }
}
