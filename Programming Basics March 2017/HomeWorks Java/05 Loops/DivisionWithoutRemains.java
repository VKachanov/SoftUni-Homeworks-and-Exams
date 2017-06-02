import java.util.Scanner;

public class DivisionWithoutRemains {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());

            if (number % 2 == 0 && number % 3 == 0 && number % 4 == 0) {
                p1 = p1 + 1;
                p2 = p2 + 1;
                p3 = p3 + 1;
            } else if (number % 3 == 0 && number % 2 == 0) {
                p2 = p2 + 1;
                p1 = p1 + 1;
            } else if (number % 4 == 0 && number % 2 == 0) {
                p3 = p3 + 1;
                p1 = p1 + 1;
            } else if (number % 3 == 0 && number % 4 == 0) {
                p2 = p2 + 1;
                p3 = p3 + 1;
            } else if (number % 2 == 0) {
                p1 = p1 + 1;
            } else if (number % 3 == 0) {
                p2 = p2 + 1;
            } else if (number % 4 == 0) {
                p3 = p3 + 3;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", p1 * 100.0 / n, p2 * 100.0 / n, p3 * 100.0 / n);
    }
}
