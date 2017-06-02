import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        if (n <= 2) {
            System.out.println(buildString("*", n));
        } else {
            if (n % 2 == 0) {

                int starCount = 2;
                int sideDashesCount = (n - starCount) / 2;
                int midDashesCount = 0;

                for (int i = 0; i < n / 2; i++) {
                    String sideDashes = buildString("-", sideDashesCount);
                    String midDashes = buildString("-", midDashesCount);
                    System.out.println(sideDashes + "*" + midDashes + "*" + sideDashes);

                    sideDashesCount--;
                    midDashesCount += 2;
                }
                sideDashesCount++;
                midDashesCount -= 2;

                for (int i = 0; i < n / 2 - 1; i++) {
                    sideDashesCount++;
                    midDashesCount -= 2;

                    String sideDashes = buildString("-", sideDashesCount);
                    String midDashes = buildString("-", midDashesCount);
                    System.out.println(sideDashes + "*" + midDashes + "*" + sideDashes);
                }
            } else {
                int sideDashesCount = (n - 1) / 2;
                System.out.println(buildString("-", sideDashesCount) + "*" + buildString("-", sideDashesCount));
                int midDashesCount = 1;

                for (int i = 1; i <= (n - 1) / 2; i++) {
                    sideDashesCount--;
                    System.out.println(buildString("-", sideDashesCount) + "*" + buildString("-", midDashesCount) + "*"
                            + buildString("-", sideDashesCount));

                    midDashesCount += 2;
                }

                midDashesCount -= 4;
                sideDashesCount += 1;

                for (int i = 1; i < (n - 1) / 2; i++) {
                    System.out.println(buildString("-", sideDashesCount) + "*" + buildString("-", midDashesCount) + "*"
                            + buildString("-", sideDashesCount));

                    sideDashesCount++;
                    midDashesCount -= 2;
                }
                System.out.println(buildString("-", sideDashesCount) + "*" + buildString("-", sideDashesCount));
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
