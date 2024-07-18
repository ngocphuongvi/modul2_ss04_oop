import java.util.Scanner;

public class Circle {
    private int radius;
    private String color;
    private final float pi= 3.14f;

    //Khoi tao duong tron co tham so
    public Circle(int radius) {
        this.radius = radius;
        this.color = color;
    }

    //Khoi tao duong tron khong co tham so
    public Circle(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phuong thuc lay gia tri ban kinh duong tron
    public int getRadius() {
        return radius;
    }

    //Phuong thuc tao gia tri ban kinh duong tron
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Phuong thuc tinh chu vi duong tron
    public float perimeter() {
        return 2 * pi * radius;
    }

    //Phuong thuc tinh dien tich duong tron
    public float area() {
        return pi * radius * radius;
    }

    //Phuong thuc nhap du lieu cho duong tron
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh duong tron: ");
        this.radius = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao mau sac cua duong tron: ");
        this.color = sc.nextLine();
    }

    //Phuong thuc hien thi thong tin thuoc tinh duong tron
    public void displayData(){
        System.out.println("Ban kinh duong tron: " + getRadius());
        System.out.println("Chu vi duong tron: " + perimeter());
        System.out.println("Dien tich duong tron: " + area());
        System.out.println("Mau sac duong tron: " + color);
    }
}
