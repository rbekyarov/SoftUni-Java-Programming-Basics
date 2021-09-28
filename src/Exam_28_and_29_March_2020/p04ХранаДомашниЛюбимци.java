package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p04ХранаДомашниЛюбимци {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kolichestvoHrana = Double.parseDouble(scanner.nextLine());
        double hranaDogTotal = 0;
        double hranaKatTotal = 0;
        double hranaBonusDog = 0;
        double hranaBonusKat = 0;
        double bonus = 0;
        //double hranaDog = Double.parseDouble(scanner.nextLine());
        //double hranaKat = Double.parseDouble(scanner.nextLine());
        double totalHrana = 0;
        for (int day = 1; day <= days; day++) {
            double hranaDog = Double.parseDouble(scanner.nextLine());
            hranaDogTotal += hranaDog;
            double hranaKat = Double.parseDouble(scanner.nextLine());
            hranaKatTotal += hranaKat;
            if (day % 3 == 0) {
                hranaBonusDog = hranaDog * 0.1;
                hranaBonusKat = hranaKat * 0.1;
                bonus = Math.ceil(hranaBonusDog + hranaBonusKat);

            }
        }
        hranaDogTotal = hranaDogTotal + hranaBonusDog;
       hranaKatTotal = hranaKatTotal + hranaBonusKat;
        totalHrana = hranaDogTotal + hranaKatTotal;
        double ostanalaHrana = kolichestvoHrana - totalHrana;

        double percentHrana = totalHrana / kolichestvoHrana * 100;
        double percentHranaDog = hranaDogTotal / kolichestvoHrana * 100;
        double percentHranaKat = hranaKatTotal / kolichestvoHrana * 100;

        System.out.println("Total eaten biscuits: " + bonus + "gr.");
        System.out.println(percentHrana + "% of the food has been eaten.");
        System.out.println(percentHranaDog + "% eaten from the dog.");
        System.out.println(percentHranaKat + "% eaten from the cat.");
    }

}
