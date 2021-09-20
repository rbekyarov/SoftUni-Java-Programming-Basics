package Kurs5Проверки;
//Задача: лица на фигури
//Да се напише програма, която въвежда размерите на геометрична фигура и пресмята лицето й. Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle). На първия ред на входа се чете вида на фигурата (square, rectangle, circle, triangle).
//• Ако фигурата е квадрат, на следващия ред се чете едно число – дължина на страната му.
//• Ако фигурата е правоъгълник, на следващите два реда се четат две числа – дължините на страните му.
//• Ако фигурата е кръг, на следващия ред се чете едно число – радиуса на кръга.
//• Ако фигурата е триъгълник, на следващите два реда се четат две числа – дължината на страната му и дължината на височината към нея.
//Резултатът да се закръгли до 3 цифри след десетичния знак.
//Примерен вход и изход Вход Изход
//Вход Изход
//Вход Изход
//Вход Изход square 5 25
//rectangle 7 2.5 17.5
//circle 6 113.097
//triangle 4.5 20 45
import java.util.Scanner;
public class p6if_else_Лица_на_фигури {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                String figura = scanner.nextLine();
                double side1 = Double.parseDouble(scanner.nextLine());
                //double side2 = Double.parseDouble(scanner.nextLine());

                double s=0;
                if (figura.equals("square")){
                  s=side1*side1;
                    System.out.printf("%.3f",s);

                }
                if (figura.equals("rectangle")){
                    double side2 = Double.parseDouble(scanner.nextLine());
                    s=side1*side2;
                    System.out.printf("%.3f",s);
    } if (figura.equals("circle")){
            s=side1*side1* Math.PI;
            System.out.printf("%.3f",s);

        } if (figura.equals("triangle")){
            double side2 = Double.parseDouble(scanner.nextLine());
                    s=(side1*side2)/2;
                System.out.printf("%.3f",s);
}
}
}