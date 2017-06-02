import java.util.Scanner;

public class p01DogHouse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double sideA = Double.parseDouble(console.nextLine());
        double heightB = Double.parseDouble(console.nextLine());

        double roofArea = 2 * (sideA*sideA/2);
        double redPaintQuantity = roofArea/5.0;

        double frontBackTriangleArea = (sideA/2.0 * (heightB - sideA/2.0))/2.0;
        double sideRectangleArea = sideA*sideA/2.0;
        double frontBackSquareArea = sideA*sideA/4.0;
        double doorArea = sideA*sideA/25.0;

        double bodyArea = 2*frontBackTriangleArea + 2* sideRectangleArea + 2*frontBackSquareArea - doorArea;
        double greenPaintQuantity = bodyArea/3.0;

        System.out.printf("%.2f%n%.2f", greenPaintQuantity, redPaintQuantity);
    }
}
