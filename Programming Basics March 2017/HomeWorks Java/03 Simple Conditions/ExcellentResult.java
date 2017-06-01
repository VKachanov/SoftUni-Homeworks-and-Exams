import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double entryGrade = Double.parseDouble(console.nextLine());

        if (entryGrade >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
