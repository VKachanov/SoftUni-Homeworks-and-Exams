import java.util.Scanner;

public class Compare3Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        double z = Double.parseDouble(console.nextLine());

        if (x == y) {
            if (y == z) {
                System.out.println("yes");
            }
        }
        if (x == y) {
            if (y!=z) {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
    }
}
