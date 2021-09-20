package Kurs5Проверки.Упражнения;
/*
Да се напише програма, която чете час и минути от 24-часово денонощие,
въведени от потребителя и изчислява колко ще е часът след 15 минути.
Резултатът да се отпечата във формат часове:минути.
Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
Часовете се изписват с една или две цифри.
Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
        Примери:
*/


import java.util.Scanner;

public class p5If_else_ЧАС_плюс_15_минути_важна {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;
        if (minutes > 59)
        {
            hours++;
            minutes -= 60;
        }
        if (hours > 23)
        {
            hours = 0;
        }
        if (minutes < 10)
        {
            System.out.printf("%s:0%s", hours, minutes);

        }
        else
        {
            System.out.printf("%s:%s", hours, minutes);
        }
    }
}

