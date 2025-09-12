//pattern 4
// n = 5
// * * * * * 
// * * * *
// * * *
// * * 
// *

public class StarPattern5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = n ; i >= 1; i--){
            for(int j = 1 ; j <= i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
