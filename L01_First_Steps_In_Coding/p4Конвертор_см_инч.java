package Kurs3Първи_стъпки_в_програмирането;

import java.util.Scanner;
public class p4Конвертор_см_инч {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeter = inches *2.54;
        System.out.println("сантиметри "+ centimeter);

    }
}
