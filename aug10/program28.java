//Write a program to calculate the product of the digits of a given number.
public class program28 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int product =1,digit;
        while(num > 0){
            digit= num%10;
            product = product * digit;
            num =num/10;
        }
        System.out.println("product is "+ product);
    }
}
