//1.pattern
//          *          n==5
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * * 
public class StarPattern1{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i =1; i <= n;i++){
           for(int j = 1; j <= n-i;j++){
                System.out.print("  ");
           }
           for(int k = 1  ; k <=i ;k++){
            System.out.print("* ");
           }
           for(int m = 1 ; m < i-0;m++){
            System.out.print("* ");
           }
           System.out.println();
        }  

    }
}
