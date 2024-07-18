import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bai tap 1
//        Circle circle1 = new Circle();
//        circle1.inputData();
//        circle1.displayData();


        //Bai tap 2
//        Employee employee1 = new Employee();
//        employee1.inputData();
//        employee1.calSalary();
//        employee1.displayData();


        //Bai tap 3
//        QuadraticEquation quadraticEquation1 = new QuadraticEquation();
//        quadraticEquation1.data();

        //Bai tap 4
//        fan fan1= new fan();
//        fan1.setSpeed(fan.FAST);
//        fan1.setRadius(10);
//        fan1.setColor("yellow");
//        fan1.setOn(true);
//
//        fan fan2= new fan();
//        fan2.setSpeed(fan.MEDIUM);
//        fan2.setRadius(5);
//        fan2.setColor("blue");
//        fan2.setOn(false);
//
//        System.out.println(fan1.toString());
//        System.out.println(fan2.toString());

        //bai tap 5
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all students");
            System.out.println("2. Add new student");
            System.out.println("3. Edit student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nList of all students:");
                    for (Student student : students) {
                        student.displayData();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Add new student: ");
                    Student newStudent = new Student();
                    newStudent.inputData();
                    students.add(newStudent);
                    System.out.println("Student added successfully.");
                    break;
                case 3:
                    System.out.print("Enter student ID to edit: ");
                    String editId = scanner.nextLine();
                    boolean foundEdit = false;
                    for (Student student : students) {
                        if (student.getStudentId().equals(editId)) {
                            student.inputData();
                            System.out.println("Student information updated successfully.");
                            foundEdit = true;
                            break;
                        }
                    }
                    if (!foundEdit) {
                        System.out.println("Student ID not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    boolean foundDelete = false;
                    for (Student student : students) {
                        if (student.getStudentId().equals(deleteId)) {
                            students.remove(student);
                            System.out.println("Student deleted successfully.");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Student ID not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }



    }
}