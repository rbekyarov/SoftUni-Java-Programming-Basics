package L01_First_Steps_In_Coding;
/*
9.	Озеленяване на дворове
        Божидара разполага с няколко къщи на Черноморието и желае да озелени дворовете на някои от тях,
        като по този начин създаде уютна обстановка и комфорт на гостите си, като за целта е наела фирма.
        Напишете програма, която изчислява необходимите средства, които Божидара ще трябва да заплати на фирмата изпълнител на проекта.
        Цената на един кв. м. е 7.61лв със ДДС. Тъй като нейният двор е доста голям,
        фирмата изпълнител предлага 18% отстъпка от крайната цена.
        Вход
        От конзолата се прочита само един ред:
        1.	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00… 10000.00]
        Изход
        На конзолата се отпечатват два реда:
        •	"The final price is: {крайна цена на услугата} lv."
        •	"The discount is: {отстъпка} lv."
        Примерен вход и изход
*/


import java.util.Scanner;

public class p9Озелиняване_на_дворове {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double price = area*7.61;
        double discount = (price*0.18);
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.\n",finalPrice);
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
