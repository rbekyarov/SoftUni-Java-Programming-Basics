package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p05CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hranaKg = Integer.parseInt(scanner.nextLine());
        String command = "";
        int gramTotal = 0;
        int gram = 0;

        while (true) {
            command = scanner.nextLine();
            if (!command.equals("Adopted")) {
                gram = Integer.parseInt(command);
                gramTotal = gramTotal + gram;
            } else {
                break;
            }
        }
        int ostatuk = Math.abs(hranaKg * 1000 - gramTotal);
        if (hranaKg * 1000 >= gramTotal) {
            System.out.printf("Food is enough! Leftovers: %d grams.", ostatuk);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", ostatuk);
        }
    }
}


