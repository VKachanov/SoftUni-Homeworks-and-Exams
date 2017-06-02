import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());

            if (number<200) {
                p1 = p1+1;
            } else if (number>=200 && number<400) {
                p2 = p2+1;
            } else if (number>=400 && number<600) {
                p3 = p3+1;
            } else if (number>=600 && number<800) {
                p4 = p4+1;
            } else if (number>=800) {
                p5 = p5+1;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1*100.0/n, p2*100.0/n, p3*100.0/n, p4*100.0/n, p5*100.0/n);
    }
}
