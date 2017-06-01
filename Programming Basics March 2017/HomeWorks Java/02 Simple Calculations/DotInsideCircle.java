import java.util.Scanner;

public class DotInsideCircle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        boolean insideCircle = Math.sqrt(x*x + y*y) <=5;
        boolean outsideRectangle = x<-1||x>5||y<1||y>5;

        System.out.println(insideCircle&&outsideRectangle ? "Yes" : "No");

    }
}
