import java.util.*;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = " + sum);
        int d = a-b;
        System.out.println("Difference = " + d);
        int p = a*b;
        System.out.println("Product = " + p);
        if(b!=0){
            int q = a/b;
        System.out.println("Quotient = " + q);
            double qDecimal = (double) a/b;
         System.out.println("Decimal Quotient = " + qDecimal);   
        }
        else{
            System.out.println("Cannot divided by zero");
        }
        
    }
}
