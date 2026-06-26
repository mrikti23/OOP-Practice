import java.util.*;

public class Multiplicationtable {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the number: ");
         int n = sc.nextInt();
         if(n%2 == 0){
            System.out.println("Number is even");
         }
         else {
            System.out.println("Number is odd");
         }
         for( int i=1; i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
         }
    }
}
