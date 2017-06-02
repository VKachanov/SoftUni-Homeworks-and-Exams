import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int f0 = 1;
        int f1 = 1;
        if (n < 2) {
            System.out.println(f0);
        } else {
            for (int i = 0; i < n -1; i++) {
                int nextNumber = f0 + f1;
                f0 = f1;
                f1 = nextNumber;
            }
            System.out.println(f1);
        }

    }
}
