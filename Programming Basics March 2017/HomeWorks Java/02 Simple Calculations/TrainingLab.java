import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());

        int rawNumber = (int)(width*100/120);
        System.out.println(rawNumber);
        int columnNumber = (int)((height*100 - 100)/70);
        System.out.println(columnNumber);

        double places = rawNumber*columnNumber - 3;

        System.out.println(places);
    }

}
