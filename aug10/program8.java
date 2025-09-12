//Write a program to check if a given number is a palindrome.
public class program8 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int rev =0,digit,original=num;
        while(num > 0){
            digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        if(rev== original){
            System.out.println(rev+" is a palindrome number");
        }else{
            System.out.println(num+"is not a palindrome number");
        }
    }
}
