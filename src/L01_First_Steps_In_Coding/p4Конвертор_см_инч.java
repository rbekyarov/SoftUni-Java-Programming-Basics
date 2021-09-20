package L01_First_Steps_In_Coding;

import java.util.Scanner;
public class p4Конвертор_см_инч {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeter = inches *2.54;
        System.out.println("сантиметри "+ centimeter);

    }
}
