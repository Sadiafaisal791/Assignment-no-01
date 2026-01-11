import java.util.Scanner;

public class Thirdquestion {
    public static void main(String[] args) {
         
        Scanner say =new Scanner(System.in);
        double orgsellingprice;
        System.out.println("Enter your original selling price");
        orgsellingprice=say.nextInt();
        double discountperc;
        System.out.println("Enter your discount percentage");
        discountperc=say.nextInt();
        double dissellingprice;
        System.out.println("Your discount selling price is:");
        dissellingprice=orgsellingprice-(discountperc/100*orgsellingprice);
        System.out.println(dissellingprice);


    }
}
