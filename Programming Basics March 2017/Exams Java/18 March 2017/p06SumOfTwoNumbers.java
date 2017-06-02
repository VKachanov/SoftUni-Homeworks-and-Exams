import java.util.Scanner;

public class p06SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int beginNumber = Integer.parseInt(console.nextLine());
        int endNumber = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());

        int combinationCounter = 0;
        boolean foundCombination = false;

        for (int i = beginNumber; i <= endNumber; i++) {
            for (int j = beginNumber; j <= endNumber; j++) {
                combinationCounter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, i, j, magicNumber);
                    foundCombination = true;
                }
            }
            if (foundCombination){
                break;
            }
        }
        if (!foundCombination){
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
        }
    }
}

