import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter two integer numbers:");
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());

        if (firstNumber>secondNumber) {
            System.out.println("The greater number is: " + firstNumber);
        }   else {
            System.out.println("The greater number is: " + secondNumber);
        }

    }
}
