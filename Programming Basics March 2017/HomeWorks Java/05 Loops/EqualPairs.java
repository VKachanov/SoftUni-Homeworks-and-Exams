import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int previousSum = 0;
        int currentSum = 0;
        int difference = 0;
        int maxDifference = 0;

        for (int i = 0; i < n; i++) {
            int entryNum1 = Integer.parseInt(console.nextLine());
            int entryNum2 = Integer.parseInt(console.nextLine());

            if (i == 0) {
                previousSum = entryNum1 + entryNum2;
            } else {
                currentSum = entryNum1 + entryNum2;
                difference = Math.abs(currentSum - previousSum);

                if (difference > maxDifference) {
                    maxDifference = difference;
                }
                previousSum = currentSum;
            }
        }
        if (maxDifference == 0) {
            System.out.printf("Yes, value = %d", previousSum);
        } else {
            System.out.printf("No, maxdiff = %d", maxDifference);
        }
    }
}
