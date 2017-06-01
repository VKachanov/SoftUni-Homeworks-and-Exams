import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if (number <= 100 && number % 2 == 0) {
            System.out.println(6);
            System.out.println(number + 6);
        } else {
            if (number <= 100 && number % 10 == 5) {
                System.out.println(7);
                System.out.println(number + 7);
            } else {
                if (number <= 100) {
                    System.out.println(5);
                    System.out.println(5 + number);
                } else {
                    if (number > 100 && number <= 1000 && number % 2 == 0) {
                        System.out.println(number * 20.0 / 100 + 1);
                        System.out.println(number + number * 20.0 / 100 + 1);
                    } else {
                        if (number > 100 && number <= 1000 && number % 10 == 5) {
                            System.out.println(number * 20.0 / 100 + 2);
                            System.out.println(number * 20.0 / 100 + 2 + number);
                        } else {
                            if (number > 100 && number <= 1000) {
                                System.out.println(number * 20.0 / 100);
                                System.out.println(number * 20.0 / 100 + number);
                            } else {
                                if (number > 1000 && number % 2 == 0) {
                                    System.out.println(number * 10.0 / 100 + 1);
                                    System.out.println(number * 10.0 / 100 + 1 + number);
                                } else {
                                    if (number > 1000 && number % 10 == 5) {
                                        System.out.println(number * 10.0 / 100 + 2);
                                        System.out.println(number * 10.0 / 100 + 2 + number);
                                    } else {
                                        if (number > 1000) {
                                            System.out.println(number * 10.0 / 100);
                                            System.out.println(number * 10.0 / 100 + number);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
