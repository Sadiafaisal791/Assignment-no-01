import java.util.Scanner;

public class Secondquestion {
    public static void main(String[] args) {
     
     Scanner read=new Scanner(System.in);
     double radius;
     System.out.println("Enter radius");
     radius=read.nextInt();
     System.out.println("Circumference is");
     double circ=(2*Math.PI*radius);
     System.out.println(circ);
     System.out.println("Area is");
     double area=(Math.PI*Math.pow(radius,2));
     System.out.println(area);
     

    }
}