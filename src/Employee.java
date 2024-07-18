import java.util.Scanner;

public class Employee {
    public int employeeId;
    public String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    //Phuong thuc khoi tao 0 tham so
    public Employee() {

    }

    //Phuong thuc khoi tao co tham so
    public Employee(int employeeId, String employeeName, double rate, double salary, boolean gen, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gen = gen;
        this.age = age;
        this.rate = rate;
        this.salary = salary;
    }

    //getter& setter
    public int getAge() {
        return age;
    }

    public boolean isGen() {
        return gen;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Phuong thuc nhap du lieu tu ban phim
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID nhan vien: ");
        employeeId = sc.nextInt();
        System.out.println("Nhap ten nhan vien: ");
        employeeName = sc.next();
        System.out.println("Nhap gioi tinh nhan vien: ");
        gen = sc.nextBoolean();
        System.out.println("Nhap tuoi nhan vien: ");
        age = sc.nextInt();
        System.out.println("Nhap he so luong nhan vien: ");
        rate = sc.nextDouble();
    }

    //Phuong thuc tinh luong
    public void calSalary(){
        salary = rate * 1300000;
    }

    //Phuong thuc hien thi thong tin
    public void displayData(){
        System.out.println("ID nhan vien: "+employeeId);
        System.out.println("Ten nhan vien: "+employeeName);
        System.out.println("Gioi tinh nhan vien: "+gen);
        System.out.println("Tuoi nhan vien: "+age);
        System.out.println("He so luong nhan vien: "+rate);
        System.out.println("Luong nhan vien: "+salary);
    }


}
