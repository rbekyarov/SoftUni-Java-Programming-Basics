package L07_Nested_Loops.Упражнения;/*
4.	Train the Trainers
Курсът "Train the trainers" е към края си и финалното оценяване наближава.
Вашата задача е да помогнете на журито което ще оценява презентациите, като напишете
програма в която да изчислява средната оценка от представянето на всяка една презентация
от даден студент, а накрая средният успех от всички тях.
От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
След това на отделен ред се прочита името на презентацията - текст
За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
"{името на презентацията} - {средна оценка}."
След получаване на команда "Finish" на конзолата се печата "Student's final assessment is
{среден успех от всички презентации}." и програмата приключва.
 Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.
*/

import java.util.Scanner;

public class p4_VLOJEN_Train_the_Trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nJuri = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();

        double averageGrade = 0;
        double sumAverageGrade1 = 0;
        double sumAverageGrade = 0;
        int countNamePresentation = 0;
        while (!(namePresentation.equals("Finish"))) {
            double gradeSum = 0;
            countNamePresentation++;

            for (int j = 1; j <= nJuri; j++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
                averageGrade = gradeSum / nJuri;
            }
            System.out.printf("%s - %.2f.\n", namePresentation, averageGrade);
            sumAverageGrade += averageGrade;
            sumAverageGrade1 = sumAverageGrade / countNamePresentation;
            namePresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAverageGrade1);

    }
}
