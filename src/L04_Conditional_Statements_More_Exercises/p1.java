
    //Задача: тръби в басейн
//Басейн с обем V има две тръби, от които се пълни. Всяка тръба има определен дебит (литрите вода, минаващи през една тръба за един час).
// Работникът пуска тръбите едновременно и излиза за N часа. Напишете програма, която изкарва състоянието на басейна, в момента, когато работникът се върне.
//Входни данни
//От конзолата се четат четири реда:
//• Първият ред съдържа числото V – обем на басейна в литри – цяло число в интервала [1 … 10000].
//• Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1 … 5000].
//• Третият ред съдържа числото P2 – дебит на втората тръба за час – цяло число в интервала [1 … 5000].
//• Четвъртият ред съдържа числото H – часовете, в които работникът отсъства – число с плаваща запетая в интервала [1.0 … 24.00].
//Изходни данни
//Да се отпечата на конзолата едно от двете възможни състояния:
//• До колко се е запълнил басейна и коя тръба с колко процента е допринесла. На всички проценти да се вземе само цялата част (т.е. да се направи закръг-ляне надолу).
//o "The pool is [x]% full. Pipe 1: [y]%. Pipe 2: [z]%."
//• Ако басейнът се е препълнил – с колко литра е прелял за даденото време, число с плаваща запетая.
//"For [x] hours the pool overflows with [y] liters." * Имайте предвид, че поради вземането на цялата част на дробно число се губят
// данни и e нормално сборът на процентите да е 99%, а не 100%.
//Примерен вход и изход Вход Изход Вход Изход 1000 100 120 3 The pool is 66% full. Pipe 1: 45%. Pipe2: 54%. 100 100 100 2.5 For 2.5 hours the pool overflows with 400 liters.

    ///
    package L04_Conditional_Statements_More_Exercises;

    import java.util.Scanner;

    public class p1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int V =  Integer.parseInt(scanner.nextLine());
            int P1 = Integer.parseInt(scanner.nextLine());
            int P2 = Integer.parseInt(scanner.nextLine());
            double H = Double.parseDouble(scanner.nextLine());

            double vobsht = (P1*H) + (P2*H);
            double P1proc = ((P1*H)/vobsht*100);
            double P2proc = ((P2*H)/vobsht*100);
            double vobshtproc = (vobsht/V*100);
            double vpoveche = vobsht - V;
            if (V>=vobsht) {
              //разминаване условие и judge  System.out.printf("The pool is %.2f%% full. Pipe1: %.2f%%. Pipe2: %.2f%%. ",vobshtproc,P1proc,P2proc);
                System.out.println(vobshtproc);
                System.out.println("1");
                System.out.println(P1proc);
                System.out.println("2");
                System.out.println(P2proc);
            } else {
                System.out.printf("For %.2f hours the pool overflows with %.2f liters",H,vpoveche);
            }
        }

    }

