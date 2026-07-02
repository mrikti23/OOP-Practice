import java.util.*;

interface Payable {
    double calculatePayment();
}

class Employee implements Payable {
    String employeeName;
    double basicSalary;
    static int employeeCount = 0;
    
    Employee(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        employeeCount++;
    }
    
    public double calculatePayment() {
        return basicSalary;
    }
    
    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName + ",\nPayment: " + calculatePayment());
    }
    
    static void showEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Payment {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rikti",30000);
        Employee e2 = new Employee("Mukti", 35000);
        Employee e3 = new Employee("Rafiq", 40000);
        
        double totalPayment = 0;
        
        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
        
        totalPayment = e1.calculatePayment() + e2.calculatePayment() + e3.calculatePayment();
        
        System.out.println("Total Payment: " + totalPayment);
        
        Employee.showEmployeeCount();
    }
}