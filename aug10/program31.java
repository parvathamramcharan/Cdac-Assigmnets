//Write a program to find the sum of all prime numbers between 1 and 100.
public class program31 {
    public static boolean  isPrime(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;
        if( num%2== 0 || num%3==0){
            return false;
        }
        for(int i = 5 ; i <= Math.sqrt(num);i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int sum=0;
        for(int i = 1; i <= 100;i++){
            if(isPrime(i)){
                sum = sum+i;
            }
        }
        System.out.print("sum of all prime numbers between 1 to 100 is "+sum);
    }
}
