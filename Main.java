import java.util.*;

class Circle{
    int r;

    Circle(){
        this.r = 1;
    }
    Circle(int r){
        this.r = r ;
    }
    double area(){
        return 3.1416*r*r;
    }
    void display(){
        System.out.println("Area of the circle : " + area());
    }
}

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Circlr 1---");
        System.out.print("Enter the radius1: ");
        int r1 = sc.nextInt(); 
        Circle C1 = new Circle(r1);
        C1.display();

        System.out.println("---Circlr 2---");
        Circle c2 = new Circle();
        c2.display();

        sc.close();
    }
}
