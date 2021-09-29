package L07_Nested_Loops.Упражнения;

import java.util.Scanner;

public class p2_VLOJEN_Еднакви_суми_на_четни_нечетни_позиции {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= endNum; i++) {
            int currentNumber = i;
            int oddSum = 0;
            int evenSum = 0;
            while (currentNumber > 0) {
                oddSum += currentNumber % 10;
                currentNumber /= 10;
                evenSum += currentNumber % 10;
                currentNumber /= 10;
            }
            if (oddSum == evenSum) {
                System.out.printf("%d ",i);

            }
        }
    }
}