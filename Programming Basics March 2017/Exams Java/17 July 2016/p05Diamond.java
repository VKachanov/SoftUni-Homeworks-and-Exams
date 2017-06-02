import java.util.Scanner;

public class p05Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int width = 5 * n;
        int height = 3 * n + 2;

        int sideDotsCount = n;
        String upLine = buildString(".", sideDotsCount) + buildString("*", width - 2 * sideDotsCount)
                + buildString(".", sideDotsCount);
        System.out.println(upLine);

        for (int i = 0; i < n - 1; i++) {
            sideDotsCount--;
            int midDotsCount = width - 2 * sideDotsCount - 2;
            String sideDots = buildString(".", sideDotsCount);
            String midDots = buildString(".", midDotsCount);
            String upCycle = sideDots + "*" + midDots + "*" + sideDots;
            System.out.println(upCycle);
        }
        String midLine = buildString("*", width);
        System.out.println(midLine);

        for (int i = 1; i <= 2 * n + 1; i++) {
            if (i<2*n + 1) {
                int midDotsCount = width - 2 * sideDotsCount - 2;
                String sideDots = buildString(".", sideDotsCount);
                String midDots = buildString(".", midDotsCount);
                String downCycle = sideDots + "*" + midDots + "*" + sideDots;
                System.out.println(downCycle);

                sideDotsCount++;
            } else {
                int midDotsCount = width - 2 * sideDotsCount - 2;
                String sideDots = buildString(".", sideDotsCount);
                String midDots = buildString("*", midDotsCount);
                String downCycle = sideDots + "*" + midDots + "*" + sideDots;
                System.out.println(downCycle);

                sideDotsCount++;
            }

        }
    }

    public static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();
    }
}
