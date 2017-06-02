import java.util.Scanner;

public class p04Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int studentsCount = Integer.parseInt(console.nextLine());

        double sumGrades = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;

        for (int i = 0; i < studentsCount; i++) {
            double grade = Double.parseDouble(console.nextLine());

            if (grade >= 2.00 && grade <= 2.99) {
                p1++;
                sumGrades += grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                p2++;
                sumGrades += grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                p3++;
                sumGrades += grade;
            } else if (grade >= 5.00) {
                p4++;
                sumGrades += grade;
            }
        }
        double averageGrades = sumGrades / studentsCount;
        System.out.printf("Top students: %.2f%%%n", p4 * 100.0 / studentsCount);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", p3 * 100.0 / studentsCount);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", p2 * 100.0 / studentsCount);
        System.out.printf("Fail: %.2f%%%n", p1 * 100.0 / studentsCount);
        System.out.printf("Average: %.2f", averageGrades);

    }
}
