import java.util.Scanner;

public class p03Division {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n ; i++) {
            int entry = Integer.parseInt(console.nextLine());

            if (entry % 2 == 0) {
              p1 +=1;
            }
            if (entry % 3 == 0) {
                p2 +=1;
            }
            if (entry % 4 == 0) {
                p3 +=1;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", p1*100.0/n, p2*100.0/n, p3*100.0/n);
    }
}
