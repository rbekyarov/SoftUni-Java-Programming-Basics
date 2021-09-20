package L01_First_Steps_In_Coding;// Пример: пресмятане на лице на квадрат със страна а
//За пример да вземем следната програма, която прочита цяло число от конзолата, умножава го по него самото (вдига го на квадрат) и отпечатва резултата от
//умножението. Така можем да пресметнем лицето на квадрат по дадена дължина на страната. Следва целия сорс код на програмата.
// Запишете го във файл с име SquareArea.java, иначе ще даде грешка при компилация: // Put this code in the file: SquareArea.java

import java.util.Scanner;

public class p3Лице_на_квадрат {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        int area = a * a;

        System.out.print("Square area = ");
        System.out.println(area);
        //Тест промяна
    }
}



