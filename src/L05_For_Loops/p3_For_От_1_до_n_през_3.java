package L05_For_Loops;

import java.util.Scanner;

public class p3_For_От_1_до_n_през_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number<=n ; number = number + 3 ) {
            System.out.println(number);

        }

    }
}
