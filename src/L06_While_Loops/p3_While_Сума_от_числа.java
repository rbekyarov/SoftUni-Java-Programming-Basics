package L06_While_Loops;//Чете от потребителя цели числа
// Приключва докато не получи сума равна на първото въведено число
//извежда сумата на всички прочетени числа
import java.util.Scanner;

public class p3_While_Сума_от_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumTarget = Integer.parseInt(scanner.nextLine());// число от потребителя което трябва да стигнем чрез сумиране
        int sum = 0;

        while ( sum < sumTarget ){
            int num = Integer.parseInt(scanner.nextLine());// потребителя въвежда числа докато
            sum+=num;// сумира всяко подадено число докато sum < sumTarget
        } System.out.println(sum);
    }
}
