//Write a program to calculate the sum of digits of a given number
public class program7 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int digit, sum=0;
        while(num > 0){
            digit = num%10;
            sum += digit;
            num = num/10;
        }
        System.out.println("sum of digits is "+sum);

    }
}
