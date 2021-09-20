package Kurs5Проверки.Упражнения;

import java.util.Scanner;

// КОНВЕРТОР НА МЕРНИ ЕДЕНИЦИ - МЕТРИ
public class p4if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("КОНВЕРТОР НА МЕРНИ ЕДИНИЦИ  - ДЪЛЖИНИ");
        System.out.println("Въведете число");
        double num = Double.parseDouble(scanner.nextLine());
        System.out.println("Изберете мерна единица - mm,cm,m,km,mi,in,ft,yd ");
        String x = scanner.nextLine();
        if (!((x.equals("mm")) || x.equals("cm") || x.equals("mi") || x.equals("in") || x.equals("km") || x.equals("ft") || x.equals("yd") || x.equals("m"))) {
            System.out.println("Грешка при въвеждане");
            System.out.println("Моля въведете отново из между - mm,cm,m,km,mi,in,ft,yd ");
            x = scanner.nextLine();
        }
        System.out.println("Конвертирам в ? - mm,cm,m,km,mi,in,ft,yd ");
        String y = scanner.nextLine();
        if (!(y.equals("mm") || y.equals("cm") || y.equals("mi") ||y.equals("in") || y.equals("km") || y.equals("ft") || y.equals("yd") || y.equals("m"))) {
            System.out.println("Грешка при въвеждане");
            System.out.println("Моля въведете отново из между - mm,cm,m,km,mi,in,ft,yd ");
            y = scanner.nextLine();
        }
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.37007787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double m = 1;
        double result = 0;


            if (x.equals("mm")) {
                result = num / mm;
            } else if (x.equals("cm")) {
                result = num / cm;
            } else if (x.equals("mi")) {
                result = num / mi;
            } else if (x.equals("in")) {
                result = num / in;
            } else if (x.equals("km")) {
                result = num / km;

            } else if (x.equals("ft")) {
                result = num / ft;
            } else if (x.equals("yd")) {
                result = num / yd;
            } else if (x.equals("m")) {
                result = num;
            }

        if (y.equals("mm")) {
            result = result * mm;
        } else if (y.equals("cm")) {
            result = result * cm;
        } else if (y.equals("mi")) {
            result = result * mi;
        } else if (y.equals("in")) {
            result = result * in;
        } else if (y.equals("km")) {
            result = result * km;
        } else if (y.equals("ft")) {
            result = result * ft;
        } else if (y.equals("yd")) {
            result = result * yd;
        } else if (y.equals("m")) {
            result = result;
        } else {
            y = scanner.nextLine();
        }

        System.out.printf("Резултат: %.0f%s. =  %.3f%s.", num, x, result, y);
        num = Double.parseDouble(scanner.nextLine());
    }
}
