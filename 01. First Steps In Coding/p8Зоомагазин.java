package Kurs3Първи_стъпки_в_програмирането;
/*8.	Първи_стъпки_в_програмирането.Зоомагазин
        Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета.
        Храната се пазарува основно за кучета, от зоомагазин, но понякога стопанинът им купува и за животните на съседа му.
        Една опаковка храна за кучета е на цена 2.50лв., а всяка друга, която не е за тях струва 4лв.
        Вход
        От конзолата се четат 2 реда:
        1.	Броят на кучетата – цяло число в интервала [0… 100]
        2.	Броят на останалите животни  - цяло число в интервала [0… 100]
        Изход
        На конзолата се отпечатва:
        "{крайната сума} lv."*/


import java.util.Scanner;

public class p8Зоомагазин {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDogs = Integer.parseInt(scanner.nextLine());
        int numAnimals = Integer.parseInt(scanner.nextLine());
        Double price = (numDogs*2.5) + (numAnimals*4);
        System.out.printf("%.1f lv.",price);


    }
}
