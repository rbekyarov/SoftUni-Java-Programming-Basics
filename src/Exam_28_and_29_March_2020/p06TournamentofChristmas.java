package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p06TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
        До получаване на командата "Finish" се чете:
•	Спорт  – текст
        За всеки спорт се прочита:
        o	Резултат  – текст с възможности: "win" или "lose"
*/
        int days = Integer.parseInt(scanner.nextLine());
        String typeSport = "";
        String result = "";
        String command = "";
        double money = 0;
        double dayMoney = 0;
        int counterWin = 0;
        int counterLose = 0;
        int counterDayWin = 0;
        int counterDayLose = 0;
        for (int i = 1; i <= days; i++) {
            while (true) {
                if (!command.equals("Finish")) {
                    typeSport = scanner.nextLine();
                    if (typeSport.equals("Finish")) {
                        dayMoney+=money;
                        break;
                    }
                    result = scanner.nextLine();
                    if (result.equals("win")) {
                        money += 20;
                        counterWin++;
                        counterDayWin++;
                    } else if (result.equals("lose")) {
                        money += 0;
                        counterLose++;
                        counterDayLose++;
                    } if(counterDayWin>counterDayLose){
                        money=money+0.1*money;
                    }
                }
            }
        }
        if (counterWin > counterLose) {
            dayMoney = dayMoney + 0.2 * dayMoney;
            System.out.printf("You won the tournament! Total raised money: %.2f", dayMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", dayMoney);
        }
    }
}
