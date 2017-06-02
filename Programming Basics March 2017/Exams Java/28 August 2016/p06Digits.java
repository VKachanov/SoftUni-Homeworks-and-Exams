import java.util.Scanner;

public class p06Digits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int thirdDigit = n % 10;
        int tempNumber = n / 10;
        int secondDigit = tempNumber % 10;
        int firstDigit = n / 100;

        int rows = firstDigit + secondDigit;
        int columns = firstDigit + thirdDigit;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= columns ; j++) {
                if (n % 5 == 0) {
                    n = n - firstDigit;
                    System.out.print(n + " ");

                } else if (n % 3 == 0) {
                    n  = n - secondDigit;
                    System.out.print(n + " ");

                } else {
                    n = n  + thirdDigit;
                    System.out.print(n  + " ");
                }

            }
            System.out.println();
        }

    }
}
