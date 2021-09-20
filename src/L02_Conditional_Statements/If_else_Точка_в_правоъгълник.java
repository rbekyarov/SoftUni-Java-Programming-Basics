package Kurs5Проверки;//Пример: точка в правоъгълник
//Проверка дали точка {x, y} се намира вътре в правоъгълника {x1, y1} – {x2, y2}.
// Входните данни се четат от конзолата и се състоят от 6 реда: десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2).
//Примерен вход и изход Вход Изход Визуализация 2 -3 12 3 8 -1 Inside
import java.util.Scanner;

public class If_else_Точка_в_правоъгълник {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if ((x>=x1 && x<=x2) && (y>=y1 && y<=y2)) {
            System.out.println("Inside");

        }else {
            System.out.println("Outside");
        }

    }
}