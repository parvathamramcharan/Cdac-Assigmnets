//Write a program to check if a given number is prime.
public class program5 {
     public static boolean  isPrime(int num){
            if(num <=1){
                return false;
            }
            if(num<=3){
                return true;
            }
            if(num%2==0 || num%3==0){
                return false;
            }
            for(int i = 5 ; i< Math.sqrt(num);i=i+6){
                if(num%i==0 || num%(i+2)==0){
                    return false;
                }
            }
            return true;
            
        }
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(isPrime(num)){
            System.err.println(num+" is a prime");
        }else{
            System.out.println(num +" is not a prime");
        }
    }
}
