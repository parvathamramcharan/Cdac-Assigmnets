//Write a program to check if a given number is a strong number.
//A Strong number is anumber which is equal to sum of its each digit factorial
public class program29 {
        public static int fact(int num){
            if(num == 0) return 1;
            return  num*fact(num-1);
        }
        public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int original = num,sum=0,digit;

        while(num > 0){
            digit = num%10;
            sum = sum + fact(digit);
            num= num/10;
        }
        if(sum== original){
            System.out.println(original+" is a strong number");
        }else{
            System.out.println(original+" is not a strong number");
        }
    }
}
