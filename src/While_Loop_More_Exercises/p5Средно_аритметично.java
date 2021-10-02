package While_Loop_More_Exercises;

import java.util.Scanner;

public class p5Средно_аритметично {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityNum = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= quantityNum; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += 1.0 * num / quantityNum;
        }
        System.out.printf("%.2f", sum);
    }
}
