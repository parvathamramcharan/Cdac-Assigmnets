//Class and methods:
//Create a class Calculator with relevant data members and a constructor. 
//Implement methods for basic arithmetic operations 
//(addition, subtraction, multiplication, division, modulus) and demonstrate their usage.
class Calculator{
    int  num1;
    int num2;
    Calculator(){

    }
    Calculator(int n1 ,int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    int add(){
        return num1+num2;
    }
    int subtract(){
        return num1-num2;
    }
    int multiply(){
        return num1*num2;
    }
    int division(){
        if(num2==0){
            System.out.println("Error: Division by zero");
            return 0;
        }
        return num1/num2;
    }
    int modulus(){
        if (num2 == 0) {
            System.out.println("Error: Modulus by zero!");
            return 0;
        }
        return num1 % num2;
    }
}
public class Problem8 {
  public static void main(String[] args) {
    Calculator c1 = new Calculator(5,2);
    
    System.out.println("Addition is : "+c1.add());
    System.out.println("Subtraction is : "+c1.subtract());
    System.out.println("Multiplication is : "+c1.multiply());
    System.out.println("division is : "+c1.division());
    System.out.println("Modulus is : "+c1.modulus());
    

  }  
}
