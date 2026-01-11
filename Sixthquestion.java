import java.util.Scanner;

public class Sixthquestion {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        double a;
        System.out.println("Enter the first parallel side(a): ");
        a=sc.nextInt();
        double b;
        System.out.println("Enter the second parallel side(b): ");
        b=sc.nextInt();
        double h;
        System.out.println("Enter the height(h):");
        h=sc.nextInt();
        double area;
        area=0.5*(a+b)*h;
        System.out.println("the area of trapezoid is:" + area);
       
    }
}
