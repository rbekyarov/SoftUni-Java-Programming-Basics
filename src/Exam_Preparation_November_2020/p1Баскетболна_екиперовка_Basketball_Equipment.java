package Exam_Preparation_November_2020;

import java.util.Scanner;

public class p1Баскетболна_екиперовка_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = Integer.parseInt(scanner.nextLine());

        double sneakers = money - 0.40 * money;
        double equipment = sneakers - 0.2 * sneakers;
        double ball = 1.0 / 4 * equipment;
        double accessory = 1.0 / 5 * ball;
        double sum = money + sneakers + equipment + ball + accessory;

        System.out.printf("%.2f", sum);
    }
}
