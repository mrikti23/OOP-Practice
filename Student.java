import java.util.*;

class stu {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }

    }
}


public class Student {
    public static void main (String[] args){
          stu s = new stu();
          s.setName("Rikti");
          s.setAge(18);
          System.out.println(s.getName() + " " + s.getAge());
    }
}
