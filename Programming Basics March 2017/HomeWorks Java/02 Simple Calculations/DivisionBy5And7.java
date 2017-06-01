import java.util.Scanner;

public class DivisionBy5And7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.next());

        boolean five = input%5==0;
        boolean seven = input%7==0;


        System.out.println(five&&seven ? "Yes" : "No");

    }
}
