import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int entryNumber = Integer.parseInt(console.nextLine());

        boolean even = entryNumber%2 == 0;

        System.out.println(even ? "even" : "odd");

    }
}
