import java.util.*;

class Max{
    int a;
    int b;

    static int max(int a ,int b){
        return (a > b) ? a : b;
    }
    static double max(double a, double b){
       return (a > b) ? a : b;
    }
    static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
}

public class Maximum {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number a & b :  ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         System.out.println("Maximum number is: " + Max.max(a, b));

         System.out.print("Enter the number a & b :  ");
         double  x = sc.nextDouble();
         double  y = sc.nextDouble();
         System.out.println("Maximum number is: " + Max.max(x, y));

         System.out.print("Enter the number a & b & c:  ");
         int p = sc.nextInt();
         int q = sc.nextInt();
         int r = sc.nextInt();
         System.out.println("Maximum number is: " + Max.max(p ,q ,r));

         sc.close();
    }
}
