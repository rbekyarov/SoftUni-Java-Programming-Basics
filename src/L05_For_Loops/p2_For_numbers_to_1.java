package L05_For_Loops;

import java.util.Scanner;

public class p2_For_numbers_to_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }

    }
}
