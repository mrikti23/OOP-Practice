import java.util.*;

class  BankAccount{
     String accnumber ;
     double balance;

     BankAccount(){
        this.accnumber = "Unknown";
        this.balance = 0 ;
     }
     BankAccount(String accnumber, double balance){
        this.accnumber = accnumber;
        this.balance = balance;
     }
    void deposit(double amount){
       balance = balance + amount;
       System.out.println(amount + " Deposit Successfully!");
    }
    void withdraw(double amount){
        if (balance>= amount ){
            balance = balance - amount;
            System.out.println(amount + " Withdraw Successfully!");
        }else {
            System.out.println("Insufficient balance");
        }
    }
    void display(){
        System.out.println("Account Number : " + accnumber);
        System.out.println("Balance : " + balance);
    }
}
public class BankAccountsystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Account Number : ");
        String accnumber1 = input.next();
        System.out.print("Balance : ");
        double balance1 = input.nextDouble();
        System.out.print("Enter the Deposit amount : ");
        double damount = input.nextDouble();
        System.out.print("Enter the Withdrawal amount : ");
        double wamount = input.nextDouble();
        
        BankAccount acc1 = new BankAccount(accnumber1, balance1) ;
        acc1.deposit(damount);
        acc1.withdraw(wamount);
        acc1.display();
        input.close();
    }
}
