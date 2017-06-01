import java.util.Scanner;

public class p05Butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int asteriskCount = n-2;
        String asterisks = buildString("*", asteriskCount);
        String dashes = buildString("-", asteriskCount);

        for (int i = 1; i <= asteriskCount; i++) {
            if (i%2 !=0) {
                String topAsterisks = asterisks + "\\" + " " + "/" + asterisks;
                System.out.println(topAsterisks);
            } else {
                String topDashes = dashes + "\\" + " " + "/" + dashes;
                System.out.println(topDashes);
            }
        }
        String midLine = buildString(" ", n-1)+ "@" + buildString(" ", n-1);
        System.out.println(midLine);

        for (int i = 1; i <= asteriskCount; i++) {
            if (i%2 !=0) {
                String bottomAsterisks = asterisks + "/" + " " + "\\" + asterisks;
                System.out.println(bottomAsterisks);
            } else {
                String bottomDashes = dashes + "/" + " " + "\\" + dashes;
                System.out.println(bottomDashes);
            }
        }
    }
        private   static  String buildString(String text, int repeatCount) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {

                    sb.append(text);
                }
                return sb.toString();
            }
}
