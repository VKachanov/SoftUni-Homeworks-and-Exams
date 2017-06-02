import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println("+" + buildString(" -", n-2) + " +");

        for (int i = 0; i < n-2; i++) {
            System.out.println("|" + buildString(" -", n-2) + " |");
        }

        System.out.println("+" + buildString(" -", n-2) + " +");

        }
    public  static  String buildString(String text, int repeatCount) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < repeatCount; i++) {

                sb.append(text);
            }
            return sb.toString();
        }
    }

