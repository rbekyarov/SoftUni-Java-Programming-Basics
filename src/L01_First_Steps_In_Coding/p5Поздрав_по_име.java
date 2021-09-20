package L01_First_Steps_In_Coding;

import java.util.Scanner;

public class p5Поздрав_по_име {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
                String name = scanner.nextLine();

        System.out.printf("Hello, %s!",name);
    }
}
