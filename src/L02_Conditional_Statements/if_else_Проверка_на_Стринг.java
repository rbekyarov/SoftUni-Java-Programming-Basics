package Kurs5Проверки;

import java.util.Scanner;

public class if_else_Проверка_на_Стринг {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("``червен` или жълт ? : ");
        String color = scanner.nextLine();
        if (color.equals("червен")){
            System.out.println("Домати!");
        }
        else if (color.equals("жълт")){
            System.out.println("банани!");
        }
         else if (!"color".equals("")){
            System.out.println("грешно въвеждане!");
        }

    }

}