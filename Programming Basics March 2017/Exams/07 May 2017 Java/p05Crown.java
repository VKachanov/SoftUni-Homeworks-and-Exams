import java.util.Scanner;

public class p05Crown {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int width = 2 * n - 1;
        int height = n / 2 + 4;

        String firstRowSpaces = buildString(" ", (width - 3) / 2);
        String firstRow = "@" + firstRowSpaces + "@" + firstRowSpaces + "@";
        System.out.println(firstRow);

        String secondRowSpaces = buildString(" ", (width - 5) / 2);
        String secondRow = "**" + secondRowSpaces + "*" + secondRowSpaces + "**";
        System.out.println(secondRow);

        int cycleLeftRightDotsCount = 1;
        int cycleMidDotsCount = 1;

        int cycleLength = height - 6;
        for (int i = 0; i < cycleLength; i++) {

                int cycleSpacesCount = (width - 6 - 2 * cycleLeftRightDotsCount - cycleMidDotsCount) / 2;
                String leftRightDots = buildString(".", cycleLeftRightDotsCount);
                String midDots = buildString(".", cycleMidDotsCount);
                String cycleSpaces = buildString(" ", cycleSpacesCount);
                String cycle = "*" + leftRightDots + "*" + cycleSpaces + "*" + midDots + "*" +cycleSpaces
                        + "*" + leftRightDots + "*";
                System.out.println(cycle);

                cycleLeftRightDotsCount++;
                cycleMidDotsCount +=2;
        }
        int cycleSpacesCount = (width - 6 - 2 * cycleLeftRightDotsCount - cycleMidDotsCount) / 2;
        String leftRightDots = buildString(".", cycleLeftRightDotsCount);
        String midDots = buildString(".", cycleMidDotsCount);
        String firstAfterCycle = "*" + leftRightDots + "*" + midDots + "*" + leftRightDots + "*";
        System.out.println(firstAfterCycle);

        cycleLeftRightDotsCount ++;
        String leftRightDotsLast = buildString(".", cycleLeftRightDotsCount);
        String secondAfterCycle = "*" + leftRightDotsLast + buildString("*", cycleLength) + "."
                + buildString("*", cycleLength) + leftRightDotsLast + "*";
        System.out.println(secondAfterCycle);

        String lastTwoRows = buildString("*", width);
        System.out.println(lastTwoRows);
        System.out.println(lastTwoRows);
    }
        private  static  String buildString(String text, int repeatCount) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {

                    sb.append(text);
                }
                return sb.toString();
            }
}
