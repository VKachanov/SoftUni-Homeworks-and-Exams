import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        minutes +=15;

        if (minutes>59) {
            hours++;
            minutes-=60;
        }
        if (hours>23) {
            hours=0;
        }
        if (minutes<10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
