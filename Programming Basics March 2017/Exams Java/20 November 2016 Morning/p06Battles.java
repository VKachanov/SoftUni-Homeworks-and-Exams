import java.util.Scanner;

public class p06Battles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstPlayerCount = Integer.parseInt(console.nextLine());
        int secondPlayerCount = Integer.parseInt(console.nextLine());
        int maxBattles = Integer.parseInt(console.nextLine());

        int battlesCount = 0;
        for (int i = 1; i <= firstPlayerCount; i++) {
            for (int j = 1; j <= secondPlayerCount ; j++) {
                System.out.printf("(%d <-> %d) ", i , j);
                battlesCount++;
                if (battlesCount == maxBattles) {
                    return;
                }
            }

        }
    }
}
