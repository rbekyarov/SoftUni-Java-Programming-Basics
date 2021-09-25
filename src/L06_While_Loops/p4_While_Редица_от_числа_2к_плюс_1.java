package L06_While_Loops;//Прочита цяло число n
// Отпечатва всички числа от редицата - 1 , 3 , 7 , 15 , 31,,,
// Всяко следваюо число е = предишното*2+1
import java.util.Scanner;

public class p4_While_Редица_от_числа_2к_плюс_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = 1;

        while ( k <=n){
            System.out.println(k);
            k=k*2+1;
        }


    }
}
