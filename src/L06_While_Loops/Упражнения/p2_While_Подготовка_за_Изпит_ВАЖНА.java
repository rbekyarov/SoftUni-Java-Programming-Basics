package L06_While_Loops.Упражнения;
/*
2.	Подготовка за изпит
        Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си.
         При всяка решена задача, той получава оценка. Програмата трябва да приключи прочитането на данни при команда
          "Enough" или ако Марин получи определеният брой незадоволителни оценки.
        Незадоволителна е всяка оценка, която е по-малка или равна на 4.
        Вход
        •	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        •	След това многократно се четат по два реда:
        o	Име на задача - текст
        o	Оценка - цяло число в интервала [2…6]
        Изход
        •	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
        o	"Average score: {средна оценка}"
        o	"Number of problems: {броя на всички задачи}"
        o	"Last problem: {името на последната задача}"
        •	Ако получи определения брой незадоволителни оценки:
        o	"You need a break, {брой незадоволителни оценки} poor grades."
        Средната оценка да бъде форматирана до втория знак след десетичната запетая.
*/


import java.util.Scanner;

public class p2_While_Подготовка_за_Изпит_ВАЖНА {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedGrade = Integer.parseInt(scanner.nextLine());

        int failedTimes = 0;
        int solvedProblems = 0;
        double allSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedTimes < failedGrade) {
            String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            allSum += grade;
            solvedProblems++;
            lastProblem = problemName;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedGrade);
        } else {
            System.out.printf("Average score: %.2f%n", allSum / solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}

