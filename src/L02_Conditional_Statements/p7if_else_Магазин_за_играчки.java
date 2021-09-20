package Kurs5Проверки;
/*
7.	Магазин за детски играчки
        Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни.
        С парите, които ще спечели иска да отиде на екскурзия.
        Да се напише програма, която пресмята печалбата от поръчката.
        Цени на играчките:
        •	Пъзел - 2.60 лв.
        •	Говореща кукла - 3 лв.
        •	Плюшено мече - 4.10 лв.
        •	Миньон - 8.20 лв.
        •	Камионче - 2 лв.
        Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        От спечелените пари Петя трябва да даде 10% за наема на магазина.
        Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
        Вход
        От конзолата се четат 6 реда:
        1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        2.	Брой пъзели - цяло число в интервала [0… 1000]
        3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        5.	Брой миньони - цяло число в интервала [0 … 1000]
        6.	Брой камиончета - цяло число в интервала [0 … 1000]
        Изход
        На конзолата се отпечатва:
        •	Ако парите са достатъчни се отпечатва:
        o	"Yes! {оставащите пари} lv left."
        •	Ако парите НЕ са достатъчни се отпечатва:
        o	"Not enough money! {недостигащите пари} lv needed."

        Резултатът трябва да се форматира до втория знак след десетичната запетая.
*/




import java.util.Scanner;

public class p7if_else_Магазин_за_играчки {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcurzia = Double.parseDouble(scanner.nextLine());
        int puzeli = Integer.parseInt(scanner.nextLine());
        int kukli = Integer.parseInt(scanner.nextLine());
        int mecheta = Integer.parseInt(scanner.nextLine());
        int minioni = Integer.parseInt(scanner.nextLine());
        int kamioni = Integer.parseInt(scanner.nextLine());

        double pricePuzeli = puzeli*2.6;
        double priceKukli = kukli*3;
        double priceMecheta = mecheta*4.1;
        double priceMinioni = minioni*8.2;
        double priceKamioni = kamioni*2;
        double totalPrice = priceKamioni+priceMinioni+priceKukli+priceMecheta+pricePuzeli;
       // double ostava = totalPrice-priceExcurzia;
        int broiIgrachki= puzeli+kukli+mecheta+minioni+kamioni;
        if (broiIgrachki>=50){
            totalPrice = totalPrice - totalPrice*0.25;
        }
        totalPrice = totalPrice - totalPrice*0.1;
        double ostava = totalPrice-priceExcurzia;
        if (totalPrice>=priceExcurzia){

             System.out.printf("Yes! %.2f lv left.",ostava);
         } else

            System.out.printf( "Not enough money! %.2f lv needed.",Math.abs(ostava));

    }


}
