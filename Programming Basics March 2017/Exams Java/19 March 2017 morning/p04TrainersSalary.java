import java.util.Scanner;

public class p04TrainersSalary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int lecturesCount = Integer.parseInt(console.nextLine());
        double budget = Double.parseDouble(console.nextLine());

        int jelev = 0;
        int royal = 0;
        int roli = 0;
        int trofon = 0;
        int sino = 0;
        int other = 0;

        for (int i = 0; i < lecturesCount; i++) {
            String lecturer = console.nextLine().toLowerCase();

            switch (lecturer) {
                case "jelev":
                    jelev++;
                    break;
                case "royal":
                    royal++;
                    break;
                case "roli":
                    roli++;
                    break;
                case "trofon":
                    trofon++;
                    break;
                case "sino":
                    sino++;
                    break;
                default:
                    other++;
                    break;
            }
        }
        System.out.printf("Jelev salary: %.2f lv%n", budget / lecturesCount * jelev);
        System.out.printf("RoYaL salary: %.2f lv%n", budget / lecturesCount * royal);
        System.out.printf("Roli salary: %.2f lv%n", budget / lecturesCount * roli);
        System.out.printf("Trofon salary: %.2f lv%n", budget / lecturesCount * trofon);
        System.out.printf("Sino salary: %.2f lv%n", budget / lecturesCount * sino);
        System.out.printf("Others salary: %.2f lv", budget / lecturesCount * other);
    }
}
