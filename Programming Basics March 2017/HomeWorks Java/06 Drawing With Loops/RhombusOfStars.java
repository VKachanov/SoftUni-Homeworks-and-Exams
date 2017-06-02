import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            String spaces = buildString(" ", (n - 1) - i);
            System.out.println(spaces + "*" + buildString(" *", i));
        }

        for (int i = n - 1; i > 0; i--) {
            String spaces = buildString(" ", n - i);
            System.out.println(spaces + "*" + buildString(" *", i-1));
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
