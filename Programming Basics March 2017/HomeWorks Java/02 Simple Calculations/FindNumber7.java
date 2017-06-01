import java.util.Scanner;

public class FindNumber7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        double first = input/100;
        double second = first%10;

        System.out.println(second==7 ? "Yes" : "No");

    }
}
