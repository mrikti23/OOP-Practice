import java.util.*;

class BankAccount{
    private String  accNumber ;
    private double balance;
    private static double interestRate = 2.5;
    public BankAccount(String accNumber , double balance){
        this.accNumber = accNumber;
        this.balance = balance;
     }
    public static void setinterestRate(double newRate){
        interestRate = newRate;
    }
    public void display(){
        System.out.println("Account Number : " +accNumber);
        System.out.println("Balance : " + balance + "$\n");
        System.out.println("Interest Rate : " + interestRate + " %\n");
    }

}
public class BankAccountRate {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("we3456", 4000);
        BankAccount acc2 = new BankAccount("tr4321", 50000);

        System.out.println("Before Interest Rate Change");
            acc1.display();
            acc2.display();

            BankAccount.setinterestRate(3.0);
        System.out.println("After Interest Rate Change");
            acc1.display();
            acc2.display();

    }
}
