import java.util.*;

class Employee{
    String name;
    static String companyname = "Sonali bank";

    void display(){
        System.out.println("Name : " +name);
        System.out.println("Company name : " + Employee.companyname);
    }
}
public class EmployeeInfo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        System.out.println("--First Emploee--");
        System.out.print("Enter the name : ");
        emp1.name = sc.next();
        emp1.display();
    
        System.out.println("--Second Emploee--");
        System.out.print("Enter the name : ");
        emp2.name = sc.next();
        emp2.display();

        System.out.println("--Third Emploee--");
        System.out.print("Enter the name : ");
        emp3.name = sc.next();
        emp3.display();

        
        emp2.companyname = "Pubali Bank";
        System.out.println(emp1.companyname);
        System.out.println(emp3.companyname);
        sc.close();
    }
}