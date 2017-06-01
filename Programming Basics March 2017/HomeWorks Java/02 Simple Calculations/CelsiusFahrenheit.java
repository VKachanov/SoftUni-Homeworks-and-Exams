import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please, enter degrees in Celsius: ");
        double celsius = Double.parseDouble(console.nextLine());

        double fahrenheit = celsius*1.8+32;

        System.out.printf("The degrees in Fahrenheit are: %.2f", fahrenheit);
    }
}
