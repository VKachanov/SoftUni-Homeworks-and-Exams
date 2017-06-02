import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int num = Integer.parseInt(console.nextLine());
        int max = num;
        int sum = num;

        for (int i = 0; i < n - 1; i++) {
            num = Integer.parseInt(console.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        int difference = max - (sum - max);
        if (difference == 0) {
            System.out.printf("Yes Sum = %d", max);
        } else {
            System.out.printf("No Diff = %d", Math.abs(difference));
        }
    }
}
