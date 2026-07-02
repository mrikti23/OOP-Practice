import java.util.*;

class employee{
    String employeename;
    int employeeId;
    static String  companyName = "TR company";

    employee(String employeename , int employeeId){
        this.employeename = employeename;
        this.employeeId = employeeId;
    }

    void displayem(){
        System.out.println("Employee Name : " + employeename);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Company Name : " + companyName);
    }

}
class manager extends employee{
      private String depName;
      private int bonus;

      manager(String name, int id, String depName , int bonus){
        super(name,id);
        this.depName = depName;
        this.bonus = bonus;
      }
      void displaym(){
        displayem();
        System.out.println("Department Name : " + depName);
        System.out.println("Bonus : " + bonus);
      }
}

public class EmployeeSalaryMS {
    public static void main(String[] args){
        manager m1 = new manager("Rahim", 21, "Cashier", 4000);
        m1.displaym();

    }
}
