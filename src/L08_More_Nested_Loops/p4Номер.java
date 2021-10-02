
/*
Поздравления, поради вашите задълбочени знания в сферата на програмирането МВР реши да наеме точно вас
 за създаването на новата им система за генериране на специални автомобилни номера.
 Всеки един специален автомобилен номер се състой от четири числа.
 Условията, които разграничават специалните от обикновените номера са следните:
        •	Ако номерът започва с четна цифра, то той трябва да завършва на нечетна цифра и обратното –
        ако започва с нечетна,  завършва на четна
        •	Първата цифра от номера е по-голяма от последната
        •	Сумата от втората и третата цифра трябва да е четно число
        Входа се състой от две числа - начало и край на интервал, между които трябва да се генерира всяко
        едно число от номера.
        Вход
        1.	Първи ред - едноцифрено число - началото на интервала – цяло число в интервала [1…9]
        2.	Втори ред - едноцифрено число - края на интервала – цяло число в интервала [1…9]
        Изход
        На конзолата трябва да се отпечатат всички специални номера, разделени с интервал.
*/

package L08_More_Nested_Loops;

import java.util.Scanner;

public class p4Номер {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                for (int k = startNum; k <= endNum; k++) {
                    for (int l = startNum; l <= endNum; l++) {
                        boolean isEvenI = i % 2 == 0;
                        boolean isOddI= i % 2 != 0;
                        boolean isEvenL = l % 2 == 0;
                        boolean isOddL = l % 2 != 0;
                        boolean isFirstI = i > l;
                        boolean evenSum = (j + k) % 2 == 0;
                        if ((isEvenI && isOddL) || (isOddI && isEvenL)) {
                            if (isFirstI && evenSum) {

                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
    }
}
