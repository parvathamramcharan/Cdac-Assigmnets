//Write a program to find the factorial of numbers from 1 to 10.
public class program33 {
    public static int fact(int num){
        if(num==0) return  1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        for(int i =1; i <=10;i++){
            int fact  = fact(i);
            System.out.println("fact of "+i+" is "+fact);
        }
    }
}
