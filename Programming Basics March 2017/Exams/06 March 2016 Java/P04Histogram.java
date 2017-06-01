import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            int entryNumber = Integer.parseInt(console.nextLine());
            if (entryNumber < 200) {
                p1 += 1;
            } else if (entryNumber >= 200 && entryNumber < 400) {
                p2 += 1;
            } else if (entryNumber >= 400 && entryNumber < 600) {
                p3 += 1;
            } else if (entryNumber >= 600 && entryNumber < 800) {
                p4 += 1;
            } else if (entryNumber >= 800) {
                p5 += 1;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1 * 100.0 / n, p2 * 100.0 / n, p3 * 100.0 / n, p4 * 100.0 / n, p5 * 100.0 / n);
    }
}
