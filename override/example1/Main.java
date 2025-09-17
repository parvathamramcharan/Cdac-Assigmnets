public class Main {
   public static void main(String[] args) {
    Person p  = new Person("ABC",30); 
    p.disp();  // ABC 30




    System.out.println(p);  //Person@1fb3ebeb  // p is reference variable that stores the address  so that why hexadecimal
    //object class has 11 methods like hashCode(),toString(),etc.. 

   System.out.println(p.toString());//getClass().getName() + '@' + Integer.toHexString(hashCode())  //Person@1fb3ebeb
   //both  p and p.toString() same

    System.out.println(p.hashCode());     //531885035

   } 
}


//here this method is default which is called automatically
// so we are telling compiler that use my method when this method has called
// public String toString() {
//     return getClass().getName() + "@" + Integer.toHexString(hashCode());
// }
