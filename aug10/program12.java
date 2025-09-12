//Write a program to reverse a given number.
public class program12 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int digit,rev=0;
        while(num > 0){
            digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }        
        System.out.println("reverse of number is "+ rev);
    }
}
