/*Изпит по "Основи на програмирането" – 27 и 28 юли 2019
        Задача 4. Турнир по дартс
        На круизния кораб, на който Ани и семейството й прекарват лятната си почивка се организират различни
        развлечения за гостите. Ани решила да се запише за участие в турнира по дартс. В тази игра играчът започва с
        определен брой точки, които се намаляват постепенно и при достигането на точно нула точки играчът
        печели. На мишената има следните сектори – сектор с конкретен брой точки (number section), сектор,
        който удвоява точките (double ring), сектор, който утроява точките (triple ring) и център на мишената
        (bullseye). Ако играчът уцели центъра на мишената, автоматично печели играта. Играчът губи ако точките
        му станат отрицателни.
        Вход
        От конзолата първо се чете един ред:
        • Първоначален брой точки – цяло положително число в интервала [1 … 1000];
        След това последователно се четат по два реда:
        • Сектор на мишената – текст с възможности: "number section", "double ring",
        "triple ring", "bullseye"
        • Брой точки – цяло положително число в интервала [1 … 100]
        Изход
        На конзолата се отпечатва един ред:
        • Ако играчът спечели чрез достигане на нула точки:
        "Congratulations! You won the game in {брой ходове} moves!"
        • Ако играчът спечели чрез уцелване на центъра на мишената:
        "Congratulations! You won the game with a bullseye in {брой ходове} moves!"
        • Ако играчът загуби:
        "Sorry, you lost. Score difference: {брой отрицателни точки}."*/


package Exam_Preparation_Mart_2020;

import java.util.Scanner;

public class p4Турнир_по_дартс_Darts_Tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        int moves = 0;

        while (points > 0) {
            moves++;
            String sector = scanner.nextLine();

            if (sector.equals("bullseye")) {
                System.out.printf("Congratulations! You won the game with a bullseye in %s moves!\n", moves);
                break;
            }
            int pointsScored = Integer.parseInt(scanner.nextLine());

            if (sector.equals("triple ring")) {
                points -= pointsScored * 3;
            } else if (sector.equals("double ring")) {
                points -= pointsScored * 2;
            } else if (sector.equals("number section")) {
                points -= pointsScored;
            }
        }
        if (points == 0) {
            System.out.printf("Congratulations! You won the game in %s moves!", moves);
        } else if (points < 0) {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(points));
        }
    }
}