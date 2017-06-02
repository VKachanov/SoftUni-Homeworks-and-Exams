import java.util.Scanner;

public class RectangleWithStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println(buildString("*", num));
        }
    }
    public  static  String buildString(String text, int repeatCount) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < repeatCount; i++) {

                sb.append(text);
            }
            return sb.toString();
        }
}
