//Write a program to find the sum of all odd numbers between 1 and 50.
public class program25 {
    public static void main(String[] args) {
        int sum=0;
        for(int i =1; i <=50;i=i+2){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
