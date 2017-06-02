import java.util.Scanner;

public class SunGlasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        String topBottom = (buildString("*", 2 * n) + buildString(" ", n) +
                buildString("*", 2 * n));

        System.out.println(topBottom);

        String midle = "*" + buildString("/", 2 * n - 2) + "*";

        for (int i = 0; i < n - 2; i++) {
            if (i != (n-1)/2 - 1) {
                System.out.println(midle + buildString(" ", n) + midle);
            } else {
                System.out.println(midle + buildString("|", n) + midle);
            }

        }
        System.out.println(topBottom);
    }

    public static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();
    }
}
