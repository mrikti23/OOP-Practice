import java.util.*;

abstract class payment{
    double amount;

    payment(double amount){
        this.amount = amount;
    }
    abstract void pay();

}

class PayPalPayment extends payment{
      String email;

      PayPalPayment(double amount , String email){
        super(amount);
        this.email = email;   
      }
      void pay(){
        System.out.println("Payment Tk  " + amount + " using Pay Pal Account : " + email );
      }
}
class CardPayment extends payment{
    int accnumber;

    CardPayment(double amount , int accnumber){
        super(amount);
        this.accnumber = accnumber;
    }
    void pay (){
       System.out.println("Payment Tk  " + amount + " using Card Account : " + accnumber ); 
    }
}
public class OnlinePayment {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        String email = sc.next();
        int accnumber = sc.nextInt();

        PayPalPayment p1 = new PayPalPayment(amount, email);
        CardPayment p2 = new CardPayment(amount, accnumber);

        p1.pay();

        p2.pay();

    }
}
