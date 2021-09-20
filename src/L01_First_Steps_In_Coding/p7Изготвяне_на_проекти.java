package L01_First_Steps_In_Coding;
/*
Напишете програма, която изчислява колко часове ще са необходими на един архитект, за да изготви проектите на няколко строителни обекта.
 Изготвянето на един проект отнема три часа.
        Вход
        От конзолата се четат 2 реда:
        1.	Името на архитекта - текст
        2.	Брой на проектите - цяло число в интервала [0… 100]
        Изход
        На конзолата се отпечатва:
        •	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
*/

import java.util.Scanner;

public class p7Изготвяне_на_проекти {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int numProject = Integer.parseInt(scanner.nextLine());
    int time = 3*numProject;

    System.out.printf("The architect %s will need %d hours to complete %d project/s.", name,time,numProject);

}
}

