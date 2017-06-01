import java.util.Scanner;

public class AreasOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String typeOfFigure = console.nextLine();
        double area;

        if (typeOfFigure.equals("square")) {
            double sideSq = Double.parseDouble(console.nextLine());
            area = sideSq * sideSq;
            System.out.printf("%.3f", area);
        } else if (typeOfFigure.equals("rectangle")) {
            double sideRecA = Double.parseDouble(console.nextLine());
            double sideRecB = Double.parseDouble(console.nextLine());
            area = sideRecA * sideRecB;
            System.out.printf("%.3f", area);
        } else if (typeOfFigure.equals("circle")) {
            double radius = Double.parseDouble(console.nextLine());
            area = Math.PI*radius*radius;
            System.out.printf("%.3f", area);
        } else if (typeOfFigure.equals("triangle")) {
            double sideTr = Double.parseDouble(console.nextLine());
            double height = Double.parseDouble(console.nextLine());
            area = sideTr*height/2;
            System.out.printf("%.3f",area);
        }
    }
}
