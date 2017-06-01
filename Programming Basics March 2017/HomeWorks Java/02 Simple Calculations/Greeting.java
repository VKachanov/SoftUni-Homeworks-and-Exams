import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //System.out.print("Please enter your name: ");
        String name = console.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
