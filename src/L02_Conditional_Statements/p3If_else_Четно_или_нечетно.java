package Kurs5Проверки;
//Пример: четно или нечетно
//Да се напише програма, която проверява дали дадено цяло число е четно (even) или нечетно (odd).
//Задачата можем да решим с помощта на една if-else конструкция и оператора %, който връща остатък при деление на две числа.

import java.util.Scanner;

public class p3If_else_Четно_или_нечетно {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo = Integer.parseInt(scanner.nextLine());
if (chislo %2 ==0) {
    System.out.println("even");
} else{
    System.out.println("odd");
}
    }
}
