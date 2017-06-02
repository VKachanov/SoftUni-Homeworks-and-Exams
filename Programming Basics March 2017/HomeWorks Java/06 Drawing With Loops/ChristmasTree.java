import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <= n; i++) {
            String spaces = buildString(" ", n - i);
            String stars = buildString("*", i);
            System.out.println(spaces + stars + " | " + stars + spaces);
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
