package EXAM.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*    1.	Височина на стената - цяло число [0… 100]
        2.	Ширина на стената - цяло число [0… 100]
        3.	Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]
        На следващите редове до получаване на командата "Tired!" или докато не бъдат боядисани всички стени, се чете по едно число:
•	Литри боя – цяло число [0…100]:
        Забележка: Площта за боядисване да бъде закръглена нагоре до най-близкото цяло число.
*/
        int visochina = Integer.parseInt(scanner.nextLine());
        int shirina = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double plosht = 0;
        String command = "";
        int boia = 0;
        command = scanner.nextLine();
            if (!(command.equals("Tired!"))) {
                plosht = (4 * visochina * shirina);
                plosht = plosht - (plosht*percent / 100);
                boia = Integer.parseInt(command);
                for (String i = ""; !(i.equals(command)) ; i="") {
                    plosht = plosht - boia;
                    command = scanner.nextLine();
                    boia = Integer.parseInt(command);
                    if (command.equals("Tired!")){

                    }
                }
            } else  {

            System.out.printf("%d quadratic m left.",plosht);
        }

    }
}
