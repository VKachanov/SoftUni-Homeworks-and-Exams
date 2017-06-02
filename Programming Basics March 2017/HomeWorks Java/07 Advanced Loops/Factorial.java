import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int factorial = 1;

        do {
            factorial = factorial*n;
            n--;
        } while (n >= 1);
        System.out.println(factorial);
    }
}
