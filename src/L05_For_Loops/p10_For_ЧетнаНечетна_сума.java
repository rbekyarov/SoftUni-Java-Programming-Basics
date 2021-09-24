package L05_For_Loops;

import java.util.Scanner;

public class p10_For_ЧетнаНечетна_сума {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            if (i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        if (sumOdd == sumEven) {
            System.out.printf("Yes%nSum = %d", sumOdd);
        } else {
            int difference = Math.abs(sumOdd - sumEven);
            System.out.printf("No%nDiff = %d", difference);
        }
        input.close();
    }
}


