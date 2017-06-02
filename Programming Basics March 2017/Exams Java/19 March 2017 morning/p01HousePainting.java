import java.util.Scanner;

public class p01HousePainting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double xSide = Double.parseDouble(console.nextLine());
        double ySide = Double.parseDouble(console.nextLine());
        double triangleHeight = Double.parseDouble(console.nextLine());

        double noGreenPaintAreas = 1.2 * 2 + 2 * 1.5 * 1.5;
        double greenPaintArea = 2 * xSide * ySide + 2 * xSide * xSide - noGreenPaintAreas;

        double redPaintArea = 2 * xSide * ySide + 2 * xSide * triangleHeight / 2.0;

        double greenPaintLtrs = greenPaintArea / 3.4;
        double redPaintLtrs = redPaintArea / 4.3;

        System.out.printf("%.2f%n%.2f", greenPaintLtrs, redPaintLtrs);
    }
}
