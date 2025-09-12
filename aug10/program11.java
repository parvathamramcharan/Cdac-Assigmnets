//Write a program to check if a given number is Armstrong.
// armstrong number is that equal to sum of its digits , each digit powerd to total numbers of digits
public class program11 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int digit,original=num,nod=0;  
        while(num > 0){
            nod++;
            num =num/10;
        }      
        int sum=0;
        num = original;
        while(num > 0){
           digit = num%10;
           sum = sum+ (int)Math.pow(digit,nod);
           num= num/10;
        }   
        if(sum== original){
            System.out.println(original +" is a armstrong number");
        }
        else{
            System.out.println(original+" is not a armstrong number");
        }
    }
}
