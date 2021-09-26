package Exam_6_and_7_April_2019;

import java.util.Scanner;

public class p01OscarsCeremony {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naem = Integer.parseInt(scanner.nextLine());

        double statuetki = naem - naem * 0.3;
        double keturing = statuetki - statuetki * 0.15;
        double muzika = keturing - keturing * 0.5;
        double prise = naem + statuetki + keturing + muzika;
        System.out.printf("%.2f", prise);
    }

}
