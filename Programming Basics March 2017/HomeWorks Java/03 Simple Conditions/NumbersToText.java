import java.util.Scanner;

public class NumbersToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        if (input == 0) {
            System.out.println("zero");
        } else {
            if (input == 1) {
                System.out.println("one");
            } else {
                if (input == 2) {
                    System.out.println("two");
                } else {
                    if (input == 3) {
                        System.out.println("three");
                    } else {
                        if (input == 4) {
                            System.out.println("four");
                        } else {
                            if (input == 5) {
                                System.out.println("five");
                            } else {
                                if (input == 6) {
                                    System.out.println("six");
                                } else {
                                    if (input == 7) {
                                        System.out.println("seven");
                                    } else {
                                        if (input == 8) {
                                            System.out.println("eight");
                                        } else {
                                            if (input == 9) {
                                                System.out.println("nine");
                                            } else {
                                                if (input > 9) {
                                                    System.out.println("number too big");
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
    }
}
