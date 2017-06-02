import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                oddSum += Integer.parseInt(console.nextLine());
            } else {
                evenSum += Integer.parseInt(console.nextLine());
            }
        }
        int difference = Math.abs(oddSum - evenSum);
        if (difference == 0) {
            System.out.printf("Yes Sum = %d", oddSum);
        } else {
            System.out.printf("No Diff = %d", difference);
        }
    }
}
