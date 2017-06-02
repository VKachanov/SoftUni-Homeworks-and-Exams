import java.util.Scanner;

public class p05Paralelepiped {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int width = 3 * n + 1;
        int height = 4 * n + 4;
        int waveCount = n - 2;

        String firstRow = "+" + buildString("~", waveCount) + "+" + buildString(".", width - waveCount - 2);
        System.out.println(firstRow);


        int leftDotsCount = 0;
        for (int i = 0; i < 2 * n + 1; i++) {
            int rightDotsCount = width - leftDotsCount - waveCount - 3;
            String leftDots = buildString(".", leftDotsCount);
            String waves = buildString("~", waveCount);
            String rightDots = buildString(".", rightDotsCount);
            String upperCycle = "|" + leftDots + "\\" + waves + "\\" + rightDots;
            System.out.println(upperCycle);

            leftDotsCount++;
        }

        leftDotsCount = 0;
        for (int i = 0; i < 2 * n + 1; i++) {
            int rightDotsCount = width - leftDotsCount - waveCount - 3;
            String leftDots = buildString(".", leftDotsCount);
            String waves = buildString("~", waveCount);
            String rightDots = buildString(".", rightDotsCount);
            String lowerCycle = leftDots + "\\" + rightDots + "|" + waves + "|";
            System.out.println(lowerCycle);

            leftDotsCount++;
        }

        String lastRow = buildString(".", leftDotsCount) + "+" + buildString("~", waveCount) + "+";
        System.out.println(lastRow);

    }

    public static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();
    }
}
