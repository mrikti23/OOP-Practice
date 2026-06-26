import java.util.*;

class Rangle{
    int lenth;
    int width;

    Rangle(int lenth, int width){
        this.lenth = lenth;
        this.width = width;
    }
    int area(){
        return lenth*width;
    }
    int perimeter(){
        return 2*(lenth + width);
    }

    void display(){
        System.out.println("Lenth = " + lenth + " , Width = "+ width);
        System.out.println("Area = " +area());
        System.out.println("Perimeter = " + perimeter());
    }
}
 
public class Rectangle{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("---Rectangle 1---");
        System.out.print("Enter the lenth: ");
        int lenth1 = input.nextInt();

        System.out.print("Enter the width: ");
        int width1 = input.nextInt();

        Rangle R1 = new Rangle(lenth1, width1);
        R1.display();

        System.out.println("---Rectangle 2---");
        System.out.print("Enter the lenth: ");
        int lenth2 = input.nextInt();

        System.out.print("Enter the width: ");
        int width2 = input.nextInt();

        Rangle R2 = new Rangle(lenth2, width2);
        R2.display();

        input.close();
    }
}
    

 