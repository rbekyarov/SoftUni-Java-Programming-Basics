package L05_For_Loops.Упражнения;
/*
3.	Четни / нечетни позиции
        Напишете програма, която чете n-на брой числа, въведени от потребителя, и пресмята сумата,
        минимума и максимума на числата на четни и нечетни позиции (броим от 1).
        Когато няма минимален / максимален елемент, отпечатайте "No".
        Изходът да се форматира в следния вид:
        "OddSum=" + {сума на числата на нечетни позиции},
        "OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
        "OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
        "EvenSum=" + { сума на числата на четни позиции },
        "EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
        "EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
        Всяко число трябва да е форматирано до втория знак след десетичната запетая.
*/


import java.util.Scanner;

public class p3_For_Четни_и_Нечетни_Позиции {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double EvenSum = 0;
        double OddSum = 0;
        double EvenMax = Double.NEGATIVE_INFINITY;
        double EvenMin = Double.POSITIVE_INFINITY;
        double OddMax = Double.NEGATIVE_INFINITY;
        double OddMin = Double.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                EvenSum = EvenSum + num;
                if (num < EvenMin) {
                    EvenMin = num;
                }
                if (num > EvenMax) {
                    EvenMax = num;

                }
            } else {
                OddSum = OddSum + num;
                if (num < OddMin) {
                    OddMin = num;
                }
                if (num > OddMax) {
                    OddMax = num;
                }

            }
        }
        if (n == 0) {

            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        } else if (n == 1) {

            System.out.printf("OddSum=%.2f,\n", OddSum);
            System.out.printf("OddMin=%.2f,\n", OddMin);
            System.out.printf("OddMax=%.2f,\n", OddMax);
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {

            System.out.printf("OddSum=%.2f,\n", OddSum);
            System.out.printf("OddMin=%.2f,\n", OddMin);
            System.out.printf("OddMax=%.2f,\n", OddMax);
            System.out.printf("EvenSum=%.2f,\n", EvenSum);
            System.out.printf("EvenMin=%.2f,\n", EvenMin);
            System.out.printf("EvenMax=%.2f", EvenMax);
        }
    }


}

