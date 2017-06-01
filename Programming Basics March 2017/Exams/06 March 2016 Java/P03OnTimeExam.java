import java.util.Scanner;

public class P03OnTimeExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int examHour = Integer.parseInt(console.nextLine());
        int examMinute = Integer.parseInt(console.nextLine());
        int arrivalHour = Integer.parseInt(console.nextLine());
        int arrivalMinute = Integer.parseInt(console.nextLine());

        int examInMinutes = examHour * 60 + examMinute;
        int arrivalInMinutes = arrivalHour * 60 + arrivalMinute;

        int difference = arrivalInMinutes - examInMinutes;
        int hours = 0;
        int minutes = 0;

        if (difference > 0) {
            System.out.println("Late");
            if ((difference < 60)) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                hours = difference / 60;
                minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else {
            if (difference == 0 || difference >= -30) {
                System.out.printf("On time%n%d minutes before the start", Math.abs(difference));
            } else if (difference > -60 && difference < -30){
                System.out.printf("Early%n%d minutes before the start", Math.abs(difference));

            } else {
                hours = Math.abs(difference)/60;
                minutes = Math.abs(difference)%60;
                System.out.printf("Early%n%d:%02d hours before the start", hours,minutes);
            }
        }
    }
}
