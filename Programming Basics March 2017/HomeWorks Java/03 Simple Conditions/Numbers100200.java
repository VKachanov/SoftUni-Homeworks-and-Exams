import java.util.Scanner;

public class Numbers100200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
    }
}
