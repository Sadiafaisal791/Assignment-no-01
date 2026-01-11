import java.util.Scanner;

public class Fifthquestion {
    public static void main(String[] args) {
     
        Scanner set=new Scanner(System.in);
        double volt;
        System.out.println("Enter Voltage(volt)");
        volt=set.nextInt();
        double ampere;
        System.out.println("Enter Ampere(amp)");
        ampere=set.nextInt();
        double watts;
        watts=volt*ampere;
        System.out.println("watts is:");
        System.out.println(watts);


    }
}
