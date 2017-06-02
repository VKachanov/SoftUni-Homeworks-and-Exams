import java.util.Scanner;

public class p04GameOfIntervals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int movesCount = Integer.parseInt(console.nextLine());

        double result = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;

        for (int i = 0; i < movesCount; i++) {
            int entry = Integer.parseInt(console.nextLine());

            if (entry >= 0 && entry < 10) {
                p1 += 1;
                result += entry * 20.0 / 100;
            } else if (entry >= 10 && entry < 20) {
                p2 += 1;
                result += entry * 30.0 / 100;
            } else if (entry >= 20 && entry < 30) {
                p3 += 1;
                result += entry * 40.0 / 100;
            } else if (entry >= 30 && entry < 40) {
                p4 += 1;
                result += 50;
            } else if (entry >= 40 && entry <= 50) {
                p5 += 1;
                result += 100;
            } else if (entry < 0 || entry > 50) {
                p6 += 1;
                result /= 2;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", p1*100.0/movesCount);
        System.out.printf("From 10 to 19: %.2f%%%n", p2*100.0/movesCount);
        System.out.printf("From 20 to 29: %.2f%%%n", p3*100.0/movesCount);
        System.out.printf("From 30 to 39: %.2f%%%n", p4*100.0/movesCount);
        System.out.printf("From 40 to 50: %.2f%%%n", p5*100.0/movesCount);
        System.out.printf("Invalid numbers: %.2f%%%n", p6*100.0/movesCount);
    }
}
