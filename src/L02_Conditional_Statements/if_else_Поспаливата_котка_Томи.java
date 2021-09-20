package Kurs5Проверки;//Задача: поспаливата котка Том
//Котката Том обича по цял ден да спи, за негово съжаление стопанинът му си играе с него винаги когато има свободно време.
// За да се наспи добре, нормата за игра на Том е 30 000 минути в година.
// Времето за игра на Том зависи от почивните дни на стопанина му:
//• Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
//• Когато почива, стопанинът му си играе с него по 127 минути на ден.
//Напишете програма, която въвежда броя почивни дни и отпечатва дали
// Том може да се наспи добре и колко е разликата от нормата за текущата година, като прие-мем че годината има 365 дни.
//Пример: 20 почивни дни → работните дни са 345 (365 – 20 = 345). Реалното време за игра е 24 275 минути (345 * 63 + 20 * 127). Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.
//Входни данни
//Входът се чете от конзолата и се състои от едно цяло число - броят почивни дни в интервала [0 … 365].
//Изходни данни
//На конзолата трябва да се отпечатат два реда.
//• Ако времето за игра на Том е над нормата за текущата година:
//o На първия ред отпечатайте: "Tom will run away".
//o На втория ред отпечатайте разликата от нормата във формат: "{H} hours and {M} minutes more for play".
//• Ако времето за игра на Том е под нормата за текущата година:
//o На първия ред отпечатайте: "Tom sleeps well".
//o На втория ред отпечатайте разликата от нормата във формат: "{H} hours and {M} minutes less for play".
//Примерен вход и изход Вход Изход Вход Изход 20 Tom sleeps well 95 hours and 25 minutes less for play 113 Tom will run away 3 hours and 47 minutes for play
import java.util.Scanner;

public class if_else_Поспаливата_котка_Томи {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni = Integer.parseInt(scanner.nextLine());

        int norma = 30000;
        int rabota = 63;
        int pochivka = 127;
        int rabdni = 365-dni;
        double vremeigra = (rabdni*rabota)+(dni*pochivka);
        double result = Math.abs(norma - vremeigra);
        double hours = Math.abs(result/60);
        double minute = Math.abs(result%60);


if (vremeigra>norma){
    System.out.println("Tom will run away");
    System.out.printf("%.0f hours and %.0f minutes more for play",Math.floor(hours),Math.floor(minute));
}else if (vremeigra<norma) {
    System.out.println("Tom sleeps well");
    System.out.printf("%.0f hours and %.0f minutes less for play",Math.floor(hours),Math.floor(minute));
}


    }
}
