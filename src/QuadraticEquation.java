import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //Khoi tao gia tri cho 3 he so
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    //getter & setter
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    //Phuong thuc tinh delta
    public double getDiscriminant() {
        return Math.pow(b,2) - 4 * a * c;
    }

    //Phuong thuc tinh nghiem
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b + Math.pow(delta,0.5)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.pow(delta,0.5)) / (2 * a);
    }

    //Phuong thuc nhap 3 tham so va hien thi nghiem cua phuong trinh
    public void data(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if(delta > 0){
            System.out.println("The equation has two roots: "+
                    equation.getRoot1()+" and "+ equation.getRoot2());
        }else if(delta == 0){
            System.out.println("The equation has one root: "+
                    equation.getRoot1());
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}

