
/*
6.	Сватбени места
        Младоженците искат да направят списък кой на кое място ще седи на сватбената церемония.
        Местата са разделени на различни сектори. Секторите са главните латински букви като започват от A.
        Във всеки сектор има определен брой редове. От конзолата се чете броят на редовете в първия сектор (A),
        като във всеки следващ сектор редовете се увеличават с 1.
        На всеки ред има определен брой места - тяхната номерация е представена с малките латински букви.
        Броя на местата на нечетните редове се прочита от конзолата, а на четните редове местата са с 2 повече.
        Вход
        От конзолата се четaт 3 реда:
        •	Последния сектор от секторите - символ (B-Z)
        •	Броят на редовете в първия сектор - цяло число (1-100)
        •	Броят на местата на нечетен ред - цяло число (1-24)
        Изход
        Да се отпечата на конзолата всяко място на отделен ред по следния формат:
        {сектор}{ред}{място}
        Накрая трябва да отпечата броя на всички места.
*/


package L08_More_Nested_Loops;

import java.util.Scanner;

public class p6Сватбени_места_CHAR_TRUDNA {
    private static final String symbols = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lstSct = input.nextLine();
        char lastSector = lstSct.charAt(0);
        int rowsFirstSector = Integer.parseInt(input.nextLine());
        int rowsCounter = rowsFirstSector;
        int oddRowSeats = Integer.parseInt(input.nextLine());
        char oddRowSeatSymbol = symbols.charAt(oddRowSeats - 1);
        int seatsCounter = 0;
        for (char sector = 'A'; sector <= lastSector; sector++) {
            for (int rows = 1; rows <= rowsCounter; rows++) {
                if (rows % 2 == 0) {
                    for (char seat = 'a'; seat <= oddRowSeatSymbol +2; seat++) {
                        System.out.print(sector);
                        System.out.print(rows);
                        System.out.print(seat);
                        seatsCounter++;
                        System.out.println();
                    }
                } else {
                    for (char seat = 'a'; seat <= oddRowSeatSymbol; seat++) {
                        System.out.print(sector);
                        System.out.print(rows);
                        System.out.print(seat);
                        seatsCounter++;
                        System.out.println();
                    }
                }
            }
            rowsCounter++;
        }
        System.out.println(seatsCounter);
    }
}


