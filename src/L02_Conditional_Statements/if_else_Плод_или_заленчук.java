package Kurs5Проверки;//Пример: плод или зеленчук
//Нека проверим дали даден продукт е плод или зеленчук.
// Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes. Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot.
// Всички останали са "unknown".
//Примерен вход и изход Вход Изход banana tomato java fruit vegetable unknown
import java.util.Scanner;

public class if_else_Плод_или_заленчук {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        if ((product.equals("banana")) ||
        (product.equals("apple")) ||
         (product.equals("kiwi")) ||
                (product.equals("cherry")) ||
                (product.equals("lemon")) ||
                (product.equals("grapes"))) {
    System.out.println("fruit");
        } else if ((product.equals("tomato")) ||
        (product.equals("cucumber")) ||
                (product.equals("pepper")) ||
                (product.equals("carrot"))) {
            System.out.println("vegetable");

    }
        else {
            System.out.println("unknown");
        }
}
}