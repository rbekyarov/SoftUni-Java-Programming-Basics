package L03_Conditional_Statements_Advanced;

import java.util.Scanner;

public class p2Вело_състезание {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJuniors = Integer.parseInt(scanner.nextLine());
        int numSeniors = Integer.parseInt(scanner.nextLine());
        String typeTrace = scanner.nextLine();
        double taxJuniors = 0;
        double taxSeniors = 0;
        double taxTotal = 0;

        if (typeTrace.equals("trail")) {
            taxJuniors = numJuniors * 5.5;
            taxSeniors = numSeniors * 7.0;
            taxTotal = taxJuniors + taxSeniors;

        } else if (typeTrace.equals("cross-country")) {
            taxJuniors = numJuniors * 8.0;
            taxSeniors = numSeniors * 9.5;
            taxTotal = taxJuniors + taxSeniors;
            if (numJuniors + numSeniors >= 50) {
                taxTotal = taxTotal - taxTotal * 0.25;
            }

        } else if (typeTrace.equals("downhill")) {
            taxJuniors = numJuniors * 12.25;
            taxSeniors = numSeniors * 13.75;
            taxTotal = taxJuniors + taxSeniors;

        } else if (typeTrace.equals("road")) {
            taxJuniors = numJuniors * 20.0;
            taxSeniors = numSeniors * 21.5;
            taxTotal = taxJuniors + taxSeniors;

        }
        taxTotal = taxTotal - taxTotal * 0.05;
        System.out.printf("%.2f", taxTotal);

    }
}
