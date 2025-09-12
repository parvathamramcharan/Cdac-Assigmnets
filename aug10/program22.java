//Write a program to check if a given string is a palindrome using a loop.
public class program22 {
    public static void main(String[] args) {
        String s = args[0];
        int n = s.length();
        int t = n >>1;
        for(int i = 0 ; i < t;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                System.err.println("not a palindrome");
            }
        }
        System.err.println("is a paindrome");
    }
}
