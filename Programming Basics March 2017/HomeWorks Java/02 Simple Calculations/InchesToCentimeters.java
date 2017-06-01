import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter value in inches: ");
        double inches = Double.parseDouble(console.nextLine());

        double centims = inches*2.54;
        System.out.println("The value in centimeters is: " + centims);

    }
}
