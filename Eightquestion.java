import java.util.Scanner;
public class Eightquestion {
    public static void main(String[] args) {
        
    Scanner sec=new Scanner(System.in);
    double a;
    System.out.println("Enter side(a)");
    a=sec.nextInt();
    double b;
    System.out.println("Enter side(b)");
    b=sec.nextInt();
    double c;
    System.out.println("Enter side(c)");
    c=sec.nextInt();
    double s;
    s=(a+b+c)/2;
    System.out.println("The value of s is");
    System.out.println(s);
    double area;
    System.out.println("The area of traingle is:");
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println(area);


    }
}
