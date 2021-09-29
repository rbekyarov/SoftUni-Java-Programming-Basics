package L07_Nested_Loops.Упражнения;

import java.util.Scanner;

public class p6VLOJEN_Специални_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int m = 1; m <= 9; m++) {
                    for (int k = 1; k <= 9; k++) {
                        if (n % i == 0 && n % j == 0 && n % m == 0 && n % k == 0) {
                            System.out.printf("%d%d%d%d ", i, j, m, k);
                        }
                    }
                }
            }


        }
    }
}