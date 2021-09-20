package Kurs5Проверки;//Пример: число от 1 до 9 на английски
//Да се изпише число в интервала от 1 до 9 с текст на английски език (числото се чете от конзолата).
// Можем да прочетем числото и след това чрез серия от проверки отпечатваме съответстващата му английска дума:
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number==1) {
    System.out.println("one");
        } if (number==2){
            System.out.println("two");
        } if (number==3){
            System.out.println("thre");
        } else {
            System.out.println("number too big");
        }
}
}