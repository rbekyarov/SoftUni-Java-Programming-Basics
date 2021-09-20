package Kurs5Проверки;

import java.util.Scanner;
//Задача: еднакви 3 числа
//Да се напише програма, в която се въвеждат 3 числа и се отпечатва дали те са еднакви (yes / no).
public class If_else_Еднакви_три_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y= Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());

        if (x==y && x==z) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
