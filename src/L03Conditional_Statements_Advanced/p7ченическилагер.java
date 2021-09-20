/*
7.	Ученически лагер
        Частно училище организира лагери за учениците по време на ваканциите. В зависимост от вида на ваканцията (пролетна, лятна или зимна) и вида на групата (момчета/момичета или смесена) цената на нощувката в хотела е различна, както и спортът, който ще практикуват учениците.

                        Зимна ваканция	Пролетна ваканция	Лятна ваканция
        момчета/момичета	9.60	        7.20	            15
        смесена група	    10	            9.50	            20

        Училището получава отстъпка от крайната цена, в зависимост от броя на настанените в хотела ученици:
        •	Ако броят на учениците е 50 или повече, училището получава 50% отстъпка
        •	Ако броят на учениците е 20 или повече и в същото време по-малък от 50, училището получава 15% отстъпка
        •	Ако броят на учениците е 10 или повече и в същото време по-малък от 20, училището получава 5% отстъпка
        В таблицата по-долу са дадени спортовете, които ще се практикуват в зависимост от вида на ваканцията и групата:

                     Зимна ваканция	 Пролетна ваканция	Лятна ваканция
        момичета	Gymnastics	        Athletics	        Volleyball
        момчета	        Judo	        Tennis	            Football
        смесена група	Ski	            Cycling         	Swimming

        Да се напише програма, която пресмята цената, която ще заплати училището за нощувките и принтира спорта, който ще се практикува от учениците.
        Вход
        От конзолата се четат 4 реда:
        1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
        2.	Видът на групата – текст - “boys”, “girls” или “mixed”;
        3.	Брой на учениците – цяло число в интервала [1 … 10000];
        4.	Брой на нощувките – цяло число в интервала [1 … 100].
        Изход
        На конзолата се отпечатва 1 ред:
        •	Спортът, който са практикували учениците и цената за нощувките, която е заплатило училището, форматирана до втория знак след десетичната запетая, в следния формат:
        "{спортът} {цената} lv.“
*/



        package L03Conditional_Statements_Advanced;

import java.util.Scanner;

public class p7ченическилагер {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();

        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sport = "";
        double price = 0;
        if (season.equals("Winter")) {
            if (group.equals("boys") || group.equals("girls")) {
                price = students * nights*9.60;
                if (group.equals("boys")) {
                    sport = "Judo";
                }
                if (group.equals("girls")) {
                    sport = "Gymnastics";
                }

            } else if (group.equals("mixed")) {
                price = students * nights * 10;
                sport = "Ski";

            }
        } else if (season.equals("Spring")) {
            if (group.equals("boys") || group.equals("girls")) {
                price = students * nights * 7.2;
                if (group.equals("boys")) {
                    sport = "Tennis";
                }
                if (group.equals("girls")) {
                    sport = "Athletics";
                }

            } else if (group.equals("mixed")) {
                price = students * nights * 9.5;
                sport = "Cycling";

            }
        } else if (season.equals("Summer")) {
            if (group.equals("boys") || group.equals("girls")) {
                price = students * nights * 15;
                if (group.equals("boys")) {
                    sport = "Football";
                }
                if (group.equals("girls")) {
                    sport = "Volleyball";
                }

            } else if (group.equals("mixed")) {
                price = students * nights * 20;
                sport = "Swimming";

            }
        }
        if (students >= 50) {
            price -= price * 0.5;
        }
        else if (students >= 20) {
            price -= price * 0.15;
        }
        else if (students >= 10) {
            price -= price * 0.05;
        }
        System.out.printf("%s %.2f lv.", sport, price);

    }
}
