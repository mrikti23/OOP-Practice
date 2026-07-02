import java.util.*;

abstract class Vehical{
    String vehicalNumber;
    String band;

    Vehical(String vehicalNumber , String band){
        this.vehicalNumber = vehicalNumber;
        this.band = band;
    }
    void displayInfo(){
        System.out.println("The Vehical Number is : " + vehicalNumber);
        System.out.println("The Vehical Band name is : " + band);
    }
    abstract double calculateRent(int day);

}
class Car extends Vehical{
    double rentPerDay;
    Car(String vehicalNumber, String band , double rentPerDay){
        super(vehicalNumber,band);
        this.rentPerDay = rentPerDay;
    }
    double calculateRent(int day){
        return rentPerDay*day;
    }
}
class Bike extends Vehical{
    double rentPerDay;

    Bike(String vehicalNumber, String band , double rentPerDay){
        super(vehicalNumber,band);
        this.rentPerDay = rentPerDay;
    }
    double calculateRent(int day){
        return rentPerDay*day;
    }
}


public class VehicalInfo{
    public static void main(String[] args){
        Car car = new Car("Dhaka-1234", "Toyota", 1500);
        Bike bike = new Bike("Dhaka-5678", "Yamaha", 500);
        
        car.displayInfo();
        System.out.println("Rental cost for 3 days: " + car.calculateRent(3));
        
        System.out.println();
        
        bike.displayInfo();
        System.out.println("Rental cost for 5 days: " + bike.calculateRent(5));
    }

    }
