
/*
2.	Комбинации от букви
        Напишете програма, която да принтира на конзолата всички комбинации от 3 букви в зададен интервал,
         като се пропускат комбинациите съдържащи зададена от конзолата буква.
         Накрая трябва да се изпринтира броят на отпечатаните комбинации.
        Вход
        Входът се чете от конзолата и съдържа точно 3 реда:
        Ред 1.	Малка буква от английската азбука за начало на интервала – от ‘a’ до ‚z’.
        Ред 2.	Малка буква от английската азбука за край на интервала  – от първата буква до ‚z’.
        Ред 3.	Малка буква от английската азбука – от ‘a’ до ‚z’ – като комбинациите съдържащи тази буквата се пропускат.
        Изход
        Да се отпечатат на един ред всички комбинации отговарящи на условието плюс броят им разделени с интервал.
*/


package L08_More_Nested_Loops;

import java.util.Scanner;

public class p2Комбинации_от_букви_CHAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // подаваме char в конзолата
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char except = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end; k++) {

                    if (i != except && j != except && k != except) {
                        count++;
                        System.out.printf("%c%c%c ", i, j, k);

                    }
                }
            }
        }
        System.out.println(count);
    }
}
