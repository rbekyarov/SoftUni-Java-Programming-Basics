package L07_Nested_Loops;

import java.util.Scanner;

public class p7VLOJEN_Билет_за_кино {
  /*
Изпит по "Основи на програмирането" -  6 и 7 Април 2019
        Задача 6. Билети за кино
        Вашата задача е да напишете програма, която да изчислява процента на билетите за всеки тип от продадените билети: студентски(student), стандартен(standard) и детски(kid), за всички прожекции. Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.
        Вход
        Входът е поредица от цели числа и текст:
        •	На първия ред до получаване на командата "Finish" - име на филма – текст
        •	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        •	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        o	Типа на закупения билет - текст ("student", "standard", "kid")
        Изход
        На конзолата трябва да се печатат следните редове:
        •	След всеки филм да се отпечата, колко процента от кино залата е пълна
        "{името на филма} - {процент запълненост на залата}% full."
        •	При получаване на командата "Finish" да се отпечатат четири реда:
        o	"Total tickets: {общият брой закупени билети за всички филми}"
        o	"{процент на студентските билети}% student tickets."
        o	"{процент на стандартните билети}% standard tickets."
        o	"{процент на детските билети}% kids tickets."
*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int counterStudentTotal = 0;
            int counterKidsTotal = 0;
            int counterStandardTotal = 0;
            int counterTotal = 0;

            while (true) {
                String command = scanner.nextLine();
                if (command.equals("Finish")) {
                    break;
                }
                int freeSeat = Integer.parseInt(scanner.nextLine());
                int countStudent = 0;
                int countStandard = 0;
                int countKid = 0;

                for (int i = 1; i <= freeSeat; i++) {

                    String typeTicket = scanner.nextLine();
                    switch (typeTicket) {
                        case "student":
                            countStudent++;
                            counterStudentTotal++;
                            break;
                        case "standard":
                            countStandard++;
                            counterStandardTotal++;
                            break;
                        case "kid":
                            countKid++;
                            counterKidsTotal++;
                            break;
                    }
                    if (typeTicket.equals("End") || i == freeSeat) {
                        int totalBilets = (countStudent + countStandard + countKid);
                        double percentMovie = 1.0 * totalBilets / freeSeat * 100;
                        System.out.printf("%s - %.2f%% full.\n", command, percentMovie);

                        break;
                    }
                }
            }
            counterTotal = counterStandardTotal + counterKidsTotal + counterStudentTotal;
            System.out.println("Total tickets: " + counterTotal);
            System.out.printf("%.2f%% student tickets.\n", 1.0 * counterStudentTotal / counterTotal * 100);
            System.out.printf("%.2f%% standard tickets.\n", 1.0 * counterStandardTotal / counterTotal * 100);
            System.out.printf("%.2f%% kids tickets.\n", 1.0 * counterKidsTotal / counterTotal * 100);
        }
    }
