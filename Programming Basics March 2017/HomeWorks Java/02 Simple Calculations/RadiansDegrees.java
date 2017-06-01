import java.util.Scanner;

public class RadiansDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter value in Radians: ");
        double radians = Double.parseDouble(console.nextLine());

        double degrees = Math.round(radians*180/Math.PI);

        System.out.printf("The corresponding Degrees are: %f", degrees);

    }
}
