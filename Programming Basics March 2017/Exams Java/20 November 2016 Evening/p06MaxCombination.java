import java.util.Scanner;

public class p06MaxCombination {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int beginNumber = Integer.parseInt(console.nextLine());
        int endNumber = Integer.parseInt(console.nextLine());
        int maxCombination = Integer.parseInt(console.nextLine());

        int combCount = 0;

        for (int i = beginNumber; i <= endNumber; i++) {
            for (int j = beginNumber; j <= endNumber; j++) {
                System.out.printf("<%d-%d>", i, j);
                combCount++;
                if (combCount == maxCombination) {
                    return;
                }
            }
        }
    }
}

