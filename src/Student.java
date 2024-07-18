import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    //Khai bao
    public Student() {}

    public Student(String studentId, String name, int age, String gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //getter & setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Nhap du lieu
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        studentId = scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();
    }

    //Hien thi du lieu
    public void displayData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
