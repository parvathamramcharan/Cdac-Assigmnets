//Write a program to print the ASCII values of all uppercase alphabets.
public class program27 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i =0 ; i < 26 ;i++){
            System.out.println(ch+" => "+(int)ch);
            ch++;
        }
    }
}
