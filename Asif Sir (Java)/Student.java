import java.util.*;

class Stud {
    private String name;
    private int roll;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }

    void display(){
        System.out.println("Name : " + getName());
        System.out.println("Roll : " + getRoll());
    }

}
public class Student{
    public static void main (String[] args){
      Stud s1 = new Stud();
      Stud s2 = new Stud();
      System.out.println("---1st Student---");
      s1.setName("Rahim");
      s1.setRoll(200);
      s1.display();
      Scanner sc = new Scanner(System.in);
      System.out.print("Name : ");
      String name = sc.next();
      System.out.print("Roll : ");
      int roll = sc.nextInt();
      s2.setName(name);
      s2.setRoll(roll);
      s2.display();
      sc.close();

    }
}