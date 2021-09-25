package L06_While_Loops.Упражнения;
/*
3.	Почивка
        Джеси е решила да събира пари за екскурзия и иска от вас да ѝ помогнете да разбере дали ще успее
        да събере необходимата сума. Тя спестява или харчи част от парите си всеки ден.
        Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
        Вход
        От конзолата се четат:
        •	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        •	Налични пари - реално число в интервала [0.00...25000.00]
        След това многократно се четат по два реда:
        •	Вид действие - текст с възможности "spend" и "save".
        •	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
        Изход
        Програмата трябва да приключи при следните случаи:
        •	Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
        o	"You can't save the money."
        o	"{Общ брой изминали дни}"
        •	Ако Джеси събере парите за почивката на конзолата се изписва:
        o	"You saved the money for {общ брой изминали дни} days."
*/

import java.util.Scanner;

public class p3_While_Почивка {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double myMoney = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        String action = "";
        int countSpend = 0;
        int days = 0;

        while (true) {
            action = scanner.nextLine();
            sum = Double.parseDouble(scanner.nextLine());
            days++;
            if (action.equals("save")) {
                myMoney += sum;
                countSpend = 0;
            } else {
                countSpend++;
                myMoney -= sum;
                if (myMoney < 0) {
                    myMoney = 0;
                }
            }
            if (countSpend == 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }
            if (target <= myMoney) {
                System.out.println("You saved the money for " + days + " days.");
                break;
            }
        }
    }
}
