import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int left = Integer.parseInt(console.nextLine());
            leftSum = leftSum + left;
        }
        for (int i = 0; i < n; i++) {
            int right = Integer.parseInt(console.nextLine());
            rightSum = rightSum + right;
        }
        int difference = Math.abs(leftSum - rightSum);
        if (difference == 0) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", difference);
        }
    }
}
