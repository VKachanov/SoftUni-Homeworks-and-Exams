import java.util.Scanner;

public class p05HourGlass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int width = 2 * n + 1;

        String firstLastRow = buildString("*", width);
        System.out.println(firstLastRow);

        int sideDotsCount = 1;

        String secondRow = ".*" + buildString(" ", width - 4) + "*.";
        System.out.println(secondRow);

        sideDotsCount++;

        for (int i = 0; i < n - 2; i++) {
            int klombaCount = width - 2 * sideDotsCount - 2;
            String upCycle = buildString(".", sideDotsCount) + "*" + buildString("@", klombaCount)
                    + "*" + buildString(".", sideDotsCount);
            System.out.println(upCycle);

            sideDotsCount++;
        }

        String midRow = buildString(".", sideDotsCount) + "*" + buildString(".", sideDotsCount);
        System.out.println(midRow);

        sideDotsCount--;
        for (int i = 0; i < n - 2; i++) {
            int emptySpace = (width - 2 * sideDotsCount - 3) / 2;
            String downCycle = buildString(".", sideDotsCount) + "*" + buildString(" ", emptySpace)
                    + "@" + buildString(" ", emptySpace) + "*" + buildString(".", sideDotsCount);
            System.out.println(downCycle);

            sideDotsCount--;
        }
        String nextToLastRow = ".*" + buildString("@", width - 4) + "*.";
        System.out.println(nextToLastRow);

        System.out.println(firstLastRow);
    }
        private  static  String buildString(String text, int repeatCount) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {

                    sb.append(text);
                }
                return sb.toString();
            }
}
