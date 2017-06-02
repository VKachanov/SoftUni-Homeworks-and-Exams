import java.util.Scanner;

public class p01Distance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int initSpeedKmH = Integer.parseInt(console.nextLine());
        int initTimeM = Integer.parseInt(console.nextLine());
        int secondTimeM = Integer.parseInt(console.nextLine());
        int endTimeM = Integer.parseInt(console.nextLine());

        double secondSpeed = initSpeedKmH + initSpeedKmH * 10.0 / 100;
        double endSpeed = secondSpeed - secondSpeed * 5.0 / 100;

        double distanceCovered = initSpeedKmH * initTimeM / 60.0 + secondSpeed * secondTimeM / 60.0
                + endSpeed * endTimeM / 60.0;
        System.out.printf("%.2f", distanceCovered);
    }
}
