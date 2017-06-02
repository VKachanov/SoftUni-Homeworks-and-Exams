import java.util.Scanner;

public class p05Axe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int width = 5 * n;

        int leftSideDashesCount = 3 * n;
        int midDashesCount = 0;

        for (int i = 0; i < n; i++) {
            int rightSideDashesCount = width - leftSideDashesCount - midDashesCount - 2;
            String leftSideDashes = buildString("-", leftSideDashesCount);
            String midDashes = buildString("-", midDashesCount);
            String rightSideDashes = buildString("-", rightSideDashesCount);
            String upCycle = leftSideDashes + "*" + midDashes + "*" + rightSideDashes;
            System.out.println(upCycle);

            midDashesCount++;
        }
        midDashesCount--;
        for (int i = 0; i < n / 2; i++) {
            int rightSideDashesCount = width - leftSideDashesCount - midDashesCount - 2;
            String handle = buildString("*", leftSideDashesCount);
            String midDashes = buildString("-", midDashesCount);
            String rightSideDashes = buildString("-", rightSideDashesCount);
            String handleCycle = handle + "*" + midDashes + "*" + rightSideDashes;
            System.out.println(handleCycle);
        }
        for (int i = 0; i < n / 2 - 1; i++) {
            int rightSideDashesCount = width - leftSideDashesCount - midDashesCount - 2;
            String leftSideDashes = buildString("-", leftSideDashesCount);
            String midDashes = buildString("-", midDashesCount);
            String rightSideDashes = buildString("-", rightSideDashesCount);
            String downCycle = leftSideDashes + "*" + midDashes + "*" + rightSideDashes;
            System.out.println(downCycle);

            leftSideDashesCount--;
            midDashesCount+=2;
        }
        String leftSideDashes = buildString("-", leftSideDashesCount);
        String midDashes = buildString("*", midDashesCount);
        String rightSideDashes = buildString("-",  width - leftSideDashesCount - midDashesCount - 2);
        String downCycle = leftSideDashes + "*" + midDashes + "*" + rightSideDashes;
        System.out.println(downCycle);
    }

    private static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();
    }
}
