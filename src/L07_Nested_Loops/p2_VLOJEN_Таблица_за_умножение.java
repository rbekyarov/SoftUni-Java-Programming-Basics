package L07_Nested_Loops;

//Разпечатайте таблицата за умножение от 1 до 10
public class p2_VLOJEN_Таблица_за_умножение {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                int result = i*j;
                System.out.printf("%d * %d = %d\n",i,j,result);

            }
        }
    }
}
