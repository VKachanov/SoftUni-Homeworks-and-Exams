import java.util.Scanner;

public class p05ChristmasHat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int totalWidth = 4 * n + 1;
        int totalHeight = 2 * n + 5;
        int upperSideDotsCount = (totalWidth - 3) / 2;
        int midPartHeight = 2 * n;

        String upperBodyFirstRow = buildString(".", upperSideDotsCount) + "/" + "|" + "\\" + buildString(".", upperSideDotsCount);
        String upperBodySecondRow = buildString(".", upperSideDotsCount) + "\\" + "|" + "/" + buildString(".", upperSideDotsCount);
        System.out.println(upperBodyFirstRow);
        System.out.println(upperBodySecondRow);

        for (int i = 0; i < midPartHeight; i++) {
            int midDashesCount = (totalWidth - 2 * upperSideDotsCount - 3) / 2;
            String midSideDots = buildString(".", upperSideDotsCount);
            String midDashes = buildString("-", midDashesCount);
            String middleBody = midSideDots + "*" + midDashes + "*" + midDashes + "*" + midSideDots;
            System.out.println(middleBody);

            upperSideDotsCount--;
        }

        String lowerFirstLastRow = buildString("*", totalWidth);
        String lowerMiddleRow = buildString("*.", totalWidth / 2) + "*";
        System.out.println(lowerFirstLastRow);
        System.out.println(lowerMiddleRow);
        System.out.println(lowerFirstLastRow);


    }

    public static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();

    }
}
