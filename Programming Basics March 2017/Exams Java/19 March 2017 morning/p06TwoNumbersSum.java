import java.util.Scanner;

public class p06TwoNumbersSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int beginNumber = Integer.parseInt(console.nextLine());
        int endNumber = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());

        int combinationsCount = 0;

        for (int i = beginNumber; i >= endNumber ; i--) {
            for (int j = beginNumber; j >= endNumber; j--) {
                combinationsCount++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationsCount, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combinationsCount, magicNumber);
    }
}
