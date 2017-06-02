import java.util.Scanner;

public class p04SoftUniCamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int totalPeople = 0;

        for (int i = 0; i < n; i++) {
            int peopleInGroup = Integer.parseInt(console.nextLine());

            if (peopleInGroup <= 5) {
                p1 += peopleInGroup;
                totalPeople += peopleInGroup;
            } else if (peopleInGroup > 5 && peopleInGroup <= 12) {
                p2 += peopleInGroup;
                totalPeople += peopleInGroup;
            } else if (peopleInGroup > 12 && peopleInGroup <= 25) {
                p3 += peopleInGroup;
                totalPeople += peopleInGroup;
            } else if (peopleInGroup > 25 && peopleInGroup <= 40) {
                p4 += peopleInGroup;
                totalPeople += peopleInGroup;
            } else if (peopleInGroup > 40) {
                p5 += peopleInGroup;
                totalPeople += peopleInGroup;
            }

        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1 * 100.0 / totalPeople, p2 * 100.0 / totalPeople,
                p3 * 100.0 / totalPeople, p4 * 100.0 / totalPeople, p5 * 100.0 / totalPeople);
    }
}
