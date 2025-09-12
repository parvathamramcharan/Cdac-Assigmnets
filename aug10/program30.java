//Write a program to calculate the sum of the cubes of numbers from 1 to 10.
public class program30 {
    public static void main(String[] args) {
        int sum =0,cubes=0;
        for(int i = 1; i <= 10; i++){
            cubes=i*i*i;
            sum= sum+cubes;
        }
        System.out.println(sum);
    }
}
