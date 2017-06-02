import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.print("*");
            for (int j = 0; j < num - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();

//            String line = new String(new char[num]).replaceAll("\0", "* ");
//            System.out.println(line);

//            System.out.println(buildString("* ", num));
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
