import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter even number:");
        int n = 1;

        do {
            try {
                n = Integer.parseInt(console.nextLine());

                if (n % 2 != 0) {
                    System.out.println("The number is not even.");
                    System.out.print("Enter even number:");
                }
            } catch (Exception exc) {
                System.out.println("Invalid number!");
                System.out.print("Enter even number:");
            }
        } while (n % 2 != 0);
        System.out.println("Even number entered: " + n);
    }
}
