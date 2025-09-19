package assigment8;

public class PaymentProcesssor {
         private Payment p;
         PaymentProcesssor(Payment p){
               this.p=p;
         }
         public void processPayment(int money) {
             p.pay(money);
         }
}
 
