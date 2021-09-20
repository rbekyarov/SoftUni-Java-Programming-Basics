package Kurs5Проверки;

import java.util.Scanner;
//Задача: еднакви думи
//Да се напише програма, която въвежда две думи и проверява дали са еднакви. Да не се прави разлика между главни и малки букви. Да се изведе "yes" или "no".
//Примерен вход и изход Вход Изход
//Вход Изход
//Вход Изход
//Вход Изход Hello Hello yes
public class If_else_Еднакви_Думи {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String duma1 = scanner.nextLine();
        String duma2 = scanner.nextLine();

        if (duma1.equalsIgnoreCase(duma2)) {
            System.out.println("yes");
        }else
                System.out.println("no");
            }
        }


