package L06_While_Loops;

import java.util.Scanner;

public class p7_While_Най_малко_число {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int min = Integer.MAX_VALUE;
    while ( !input.equals("Stop")) {
        int number = Integer.parseInt(input); // Пробразувна от Стринг в ИНТ
        if (number <min) {
            min = number;
        }

        input = scanner.nextLine();
    }
    System.out.println(min);
}
}
