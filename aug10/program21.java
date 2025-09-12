//Write a program to print the factorial of numbers from 1 to 10.
public class program21 {
    public static int fact(int num){
        if(num==0) return 1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
      for(int i =1 ; i <= 10 ;i++){
            System.out.println("factorial of "+ i +" is "+fact(i));
      }
    }
}
