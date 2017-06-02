import java.util.Scanner;

public class p04Hospital {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int daysCount = Integer.parseInt(console.nextLine());


        int doctorsCount = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= daysCount; i++) {
            int patientsCount = Integer.parseInt(console.nextLine());
            if (i % 3 == 0) {
                if (untreatedPatients >= treatedPatients) {
                    doctorsCount++;
                }
            }
            if (doctorsCount > patientsCount) {
                treatedPatients += patientsCount;
            } else {
                treatedPatients += doctorsCount;
                untreatedPatients += (patientsCount - doctorsCount);
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
