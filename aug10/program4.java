//Write a program to find the factorial of a given number.
public class program4 {
    public static void main(String[] args) {
        int num  = Integer.parseInt(args[0]);
        int fact=1;
        for(int i = num ;i >=1;i--){
            fact *= i;
        }
        System.out.println(fact);
    }
}
