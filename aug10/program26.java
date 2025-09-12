//Write a program to check if a given number is a perfect number.
//a perfect number is a number equal to sum of its positive divisiors excludinf itself
public class program26 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum=0;
        for(int i = 1; i < num;i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(num==sum){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }

    }
}
