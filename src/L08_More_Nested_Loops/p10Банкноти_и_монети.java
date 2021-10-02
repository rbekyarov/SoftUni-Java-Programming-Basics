
/*
10.	Банкноти и монети
        Имаме банкноти и монети по 1лв., по 2лв. и по 5лв. Да се напише програма, която прочита въведените
        от потребителя брой банкноти и монети и сума, и извежда на екран всички възможни начини по които сумата
        може да се изплати с наличните банкноти.
        Вход
        Входът се чете от конзолата и съдържа точно 4 реда:
        1.	Брой монети по 1лв. - цяло положително число;
        2.	Брой монети по 2лв. - цяло положително число;
        3.	Брой банкноти по 5лв. - цяло положително число;
        4.	Сума - цяло положително число в интервала [1…1000];
        Изход
        Да се отпечатат на конзолата всички комбинации от дадените номинали, образуващи сумата,
         форматирани по следния начин:
        o	"{бр. 1лв.} * 1 lv. + {бр. 2лв.} * 2 lv. + {бр. 5лв.} * 5 lv. = {сума} lv."
*/



package L08_More_Nested_Loops;

import java.util.Scanner;

public class p10Банкноти_и_монети {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLv = Integer.parseInt(scanner.nextLine());
        int twoLv = Integer.parseInt(scanner.nextLine());
        int threeLv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLv; i++)
            for (int j = 0; j <= twoLv; j++)
                for (int k = 0; k <= threeLv; k++)
                    if (i + j * 2 + k * 5 == sum)
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n",i,j,k,sum);
    }
}
