import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter side - a = ");
        int a = Integer.parseInt(console.nextLine());
        int area = a*a;

        System.out.println("The area of the square is: " + area);
    }

}
