public class sample3 {
   public static void main(String[] args) {
    byte b = 125;
    //b = (b+1); // error incamptable data types
    b = (byte)(b + 1);
    System.out.println(b);  //126

    //float pi = 3.14; //error  
    float pi = 3.14f;
    System.out.println(pi);

    //pi = pi + 1.5; // error default takes double
    pi = pi + 1.5f;
    System.out.println(pi);

    


   }   
}
