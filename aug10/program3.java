//Write a program to print the multiplication table of a given number.
public class program3 {
  public static void main(String[] args) {
    int num =  Integer.parseInt(args[0]);
    for(int i = 1; i <=10 ;i++){
        System.out.println(num+" * "+i+" = "+(num*i));
    }
    
  }   
}
