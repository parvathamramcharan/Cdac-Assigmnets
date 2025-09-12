//Write a program to check if a given string is a palindrome.
public class program15 {
    public static boolean  palindrome(String s){
        int n = s.length();
        int t = n >> 1;
        for(int i =0; i < t;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s =  args[0];
        if(palindrome(s)){
            System.out.println(s+" is a palindrome");
        }else{
            System.out.println(s+" is not a palindrome");
        }
    }
}
