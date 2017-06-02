import java.util.Scanner;

public class p05SoftUniLogo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int totalWidth = 12 * n - 5;
        int totalHeight = 4 * n - 2;

        int topCycleDotsCount = (totalWidth - 1) / 2;

        for (int i = 0; i < 2 * n; i++) {
            int topCycleDiesCount = totalWidth - 2 * topCycleDotsCount;
            String topCycleDots = buildString(".", topCycleDotsCount);
            String topCycleDies = buildString("#", topCycleDiesCount);
            String topCycle = topCycleDots + topCycleDies + topCycleDots;
            System.out.println(topCycle);

            topCycleDotsCount -= 3;
        }
        topCycleDotsCount += 6;
        int bottomCycleIterations = totalHeight - 3*n;

        for (int i = 0; i < bottomCycleIterations; i++) {
            int bottomCycleDiesCount = totalWidth - 2 * topCycleDotsCount;
            String bottomCycleLeftSide = "|" + buildString(".", topCycleDotsCount - 1);
            String bottomCycleRightSide = buildString(".", topCycleDotsCount);
            String bottomCycleDies = buildString("#", bottomCycleDiesCount);
            String bottomCycle = bottomCycleLeftSide + bottomCycleDies + bottomCycleRightSide;
            System.out.println(bottomCycle);

            topCycleDotsCount += 3;
        }

        for (int i = 1; i <= n; i++) {
            if (i < n) {
                int bottomCycleDiesCount = totalWidth - 2 * topCycleDotsCount;
                String rootCycleLeftSide = "|" + buildString(".", topCycleDotsCount - 1);
                String rootCycleRightSide = buildString(".", topCycleDotsCount);
                String rootCycleDies = buildString("#", bottomCycleDiesCount);
                String rootCycle = rootCycleLeftSide + rootCycleDies + rootCycleRightSide;
                System.out.println(rootCycle);
            } else {
                int bottomCycleDiesCount = totalWidth - 2 * topCycleDotsCount;
                String rootCycleLeftSide = "@" + buildString(".", topCycleDotsCount - 1);
                String rootCycleRightSide = buildString(".", topCycleDotsCount);
                String rootCycleDies = buildString("#", bottomCycleDiesCount);
                String rootCycle = rootCycleLeftSide + rootCycleDies + rootCycleRightSide;
                System.out.println(rootCycle);
            }

        }

    }

    private static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();
    }
}
