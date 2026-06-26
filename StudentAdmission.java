
class Student{
    String studentName ;
    int age;
    double marks;
    String course;
    boolean isAdmitted;

    Student(){
        this.studentName = "Not Available" ;
        this.age = 0 ;
        this.marks = 0 ;
        this.course = "Not Assigned" ;
        this.isAdmitted = false;
    }
    Student(String studentName , int age , double marks){
        this.studentName = studentName ;
        this.age = age ;
        this.marks = marks ;
        if(age >= 17 && marks >= 60){
            this.course = "Computer Science" ;
            this.isAdmitted = true;
        }else{
            this.course = "Not Assigned" ;
            this.isAdmitted = false ;
        }
    }
    void display(){
        System.out.println("Student Name : " + studentName);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("Course : " + course);
        System.out.println( isAdmitted);
    }

}

public class StudentAdmission {
    public static void main(String[] args){
        Student s1  = new Student();
        Student s2  = new Student("Rafiq" , 27, 75.6);

        s1.display();
        s2.display();

    }
}
