import java.util.Scanner;

public class Fourthquestion {
     
    public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);
    double dissellingprice;
    System.out.println("Enter your disselling price");
    dissellingprice=sc.nextInt();
    double discountperc;
    System.out.println("Enter your discount percentage");
    discountperc=sc.nextInt();
    double orgsellingprice;
    orgsellingprice=(dissellingprice*100)/(100-discountperc);
    System.out.println("Your original selling price is");
    System.out.println(orgsellingprice);


    }
}
