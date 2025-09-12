//Write a program to find the sum of all odd numbers between 1 and 50
public class program9 {
    public static void main(String[] args) {
        int sum =0;
        for(int i =1 ; i<=50;i++){
            if(i%2==1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
