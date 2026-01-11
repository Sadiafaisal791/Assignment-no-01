import java.util.Scanner;
public class Firstquestion {
     
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    int om;
    int mm;
    System.out.println("Enter your obtained marks");
    om=scan.nextInt();
    System.out.println("Enter your maximum marks");
    mm=scan.nextInt();
    double p=(1.0*om/mm*100);
    System.out.println(p);

        
    
    }
}
