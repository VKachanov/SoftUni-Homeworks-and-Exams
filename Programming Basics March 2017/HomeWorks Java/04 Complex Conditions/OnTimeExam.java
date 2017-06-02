import java.util.Scanner;

public class OnTimeExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int examHour = Integer.parseInt(console.nextLine());
        int examMinute = Integer.parseInt(console.nextLine());
        int arrivalHour = Integer.parseInt(console.nextLine());
        int arrivalMinute = Integer.parseInt(console.nextLine());

        int exam = examHour * 60 + examMinute;
        int arrival = arrivalHour * 60 + arrivalMinute;

        boolean onTime = (exam - arrival <= 30) && (exam - arrival >= 0);

        int difference = arrival - exam;
        int hour, minute;

        if (difference > 0 && difference <= 59) {
            System.out.printf("Late\n%d minutes after the start", difference);
        } else if (difference > 59) {
            hour = difference / 60;
            minute = difference % 60;
            System.out.printf("Late\n%d:%02d hours after the start", hour, minute);

        } else if (onTime) {
            System.out.printf("On time\n%d minutes before the start", Math.abs(difference));

        } else if (Math.abs(difference) <= 59) {
            System.out.printf("Early\n%d minutes before the start", Math.abs(difference));

        } else {
            if (Math.abs(difference) > 59) {
                hour = Math.abs(difference / 60);
                minute = Math.abs(difference % 60);
                System.out.printf("Early\n%d:%02d hours before the start", hour, minute);
            }
        }
    }
}
