import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());

        double usableHeight = height*100.0 - 100;

        double rowNumber = Math.floor(width*100/120);
        double columnNumber = Math.floor(usableHeight/70);

        double spacesCount = rowNumber*columnNumber - 3;

        System.out.println((int)(spacesCount));

    }
}
