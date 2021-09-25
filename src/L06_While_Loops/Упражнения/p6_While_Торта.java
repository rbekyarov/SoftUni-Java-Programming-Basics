package L06_While_Loops.Упражнения;
/*
6.	Торта
        Поканени сте на 30-ти рожден ден, на който рожденикът черпи с огромна торта.
        Той обаче не знае колко парчета могат да си вземат гостите от нея.
        Вашата задача е да напишете програма, която изчислява броя на парчетата,
        които гостите са взели, преди тя да свърши.
        Ще получите размерите на тортата в сантиметри (широчина и дължина – цели числа в интервала [1...1000])
        и след това на всеки ред, до получаване на командата "STOP" или докато не свърши тортата,
        броят на парчетата, които гостите вземат от нея. Парчетата са квадратни с размер  1 см .
        Да се отпечата на конзолата един от следните редове:
        •	"{брой парчета} pieces are left." - ако стигнете до STOP и има останали парчета торта.
        •	"No more cake left! You need {брой недостигащи парчета} pieces more."
*/


import java.util.Scanner;

public class p6_While_Торта {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shirina = Integer.parseInt(scanner.nextLine());
        int duljina = Integer.parseInt(scanner.nextLine());


        int totalPieces = shirina*duljina;
        int pieces =0;
        String command = scanner.nextLine();
        while (!(command.equals("STOP"))){
             pieces = Integer.parseInt(command);
        totalPieces-= pieces;
           if (totalPieces<=0){
               System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPieces));
               break;
           }
             command = scanner.nextLine();
    }       if (command.equals("STOP")) {
            System.out.println(totalPieces+" pieces are left.");

        }
}

}
