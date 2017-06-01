import java.util.Scanner;

public class D2RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double sideA = Math.abs(x1- x2);
        double sideB = Math.abs(y1-y2);


        double area = sideA * sideB;
        double perimeter = 2 * (sideA + sideB);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
