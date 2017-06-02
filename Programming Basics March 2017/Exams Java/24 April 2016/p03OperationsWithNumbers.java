import java.util.Scanner;

public class p03OperationsWithNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1 = Integer.parseInt(console.nextLine());
        int n2 = Integer.parseInt(console.nextLine());
        char operator = console.nextLine().charAt(0);

        int result;
        String type = "odd";

        switch (operator) {
            case '+':
                result = n1 + n2;
                if (result % 2 == 0) {
                    type = "even";
                }
                System.out.printf("%d %c %d = %d - %s", n1, operator, n2, result, type);
                break;
            case '-':
                result = n1 - n2;
                if (result % 2 == 0) {
                    type = "even";
                }
                System.out.printf("%d %c %d = %d - %s", n1, operator, n2, result, type);
                break;
            case '*':
                result = n1 * n2;
                if (result % 2 == 0) {
                    type = "even";
                }
                System.out.printf("%d %c %d = %d - %s", n1, operator, n2, result, type);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double divResult = n1 * 1.0/ n2 ;
                    System.out.printf("%d %c %d = %.2f", n1, operator, n2, divResult);
                }

                break;
            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %c %d = %d", n1, operator, n2, result);
                }

                break;
        }
    }
}
