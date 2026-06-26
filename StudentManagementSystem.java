import java.io.*;
import java.util.*;

// Interface
interface StudentOperations {
    void addStudent();
    void searchStudent();
    void editStudent();
    void deleteStudent();
}

// Abstract Class
abstract class Person {
    protected int id;
    protected String name;
    protected String dept;
}

// Concrete Class
class Student extends Person implements StudentOperations {

    Scanner sc = new Scanner(System.in);
    String fileName = "students.txt";

    @Override
    public void addStudent() {
        try {
            FileWriter fw = new FileWriter(fileName, true);

            System.out.print("Enter ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter Department: ");
            dept = sc.nextLine();

            fw.write(id + "," + name + "," + dept + "\n");
            fw.close();

            System.out.println("Student Added Successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void searchStudent() {
        System.out.print("Enter Student ID to Search: ");
        int searchId = sc.nextInt();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == searchId) {
                    System.out.println("ID: " + data[0]);
                    System.out.println("Name: " + data[1]);
                    System.out.println("Department: " + data[2]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Student Not Found!");
            }

            fileScanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void editStudent() {
        System.out.print("Enter Student ID to Edit: ");
        int editId = sc.nextInt();
        sc.nextLine();

        try {
            File inputFile = new File(fileName);
            File tempFile = new File("temp.txt");

            Scanner fileScanner = new Scanner(inputFile);
            FileWriter fw = new FileWriter(tempFile);

            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == editId) {
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDept = sc.nextLine();

                    fw.write(editId + "," + newName + "," + newDept + "\n");
                    found = true;
                } else {
                    fw.write(line + "\n");
                }
            }

            fileScanner.close();
            fw.close();

            inputFile.delete();
            tempFile.renameTo(inputFile);

            if (found)
                System.out.println("Student Updated Successfully!");
            else
                System.out.println("Student Not Found!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        int deleteId = sc.nextInt();

        try {
            File inputFile = new File(fileName);
            File tempFile = new File("temp.txt");

            Scanner fileScanner = new Scanner(inputFile);
            FileWriter fw = new FileWriter(tempFile);

            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == deleteId) {
                    found = true;
                    continue;
                }

                fw.write(line + "\n");
            }

            fileScanner.close();
            fw.close();

            inputFile.delete();
            tempFile.renameTo(inputFile);

            if (found)
                System.out.println("Student Deleted Successfully!");
            else
                System.out.println("Student Not Found!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.searchStudent();
                    break;
                case 3:
                    student.editStudent();
                    break;
                case 4:
                    student.deleteStudent();
                    break;
                case 5:
                    System.out.println("Program Ended.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
