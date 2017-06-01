import java.util.Scanner;

public class p04FootballLeague {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(console.nextLine());
        int numberOfFans = Integer.parseInt(console.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 0; i < numberOfFans; i++) {
            char sector = console.nextLine().toLowerCase().charAt(0);

            switch (sector) {
                case 'a':
                    sectorA++;
                    break;
                case 'b':
                    sectorB++;
                    break;
                case 'v':
                    sectorV++;
                    break;
                case 'g':
                    sectorG++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", (double) sectorA / numberOfFans * 100.0);
        System.out.printf("%.2f%%%n", (double) sectorB / numberOfFans * 100.0);
        System.out.printf("%.2f%%%n", (double) sectorV / numberOfFans * 100.0);
        System.out.printf("%.2f%%%n", (double) sectorG / numberOfFans * 100.0);
        System.out.printf("%.2f%%%n", (double) numberOfFans / stadiumCapacity * 100.0);
    }
}
