package L07_Nested_Loops;//5. Пътуване
//Ани обича да пътува и иска тази година да посети няколко различни дестинации. Като си избере дестинация
//ще прецени колко пари ще й трябват, за да отиде до там и ще започне да спестява, когато е спестила
//достатъчно, ще може да пътува.
//От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за
//пътуването, реално число.
//След това ще се четат няколко суми, реални числа, които Ани спестява като работи и когато успее да събере
//достатъчно за пътуването, ще заминава, като на конзолата трябва да се изпише:
//"Going to (дестинацията}!"
//Когато е посетила всички дестинации, които иска, вместо дестинация ще въведе "End" и програмата ще
//приключи.
//Примерен вход и изход
//Вход
//Greece
//1000
//200
//200
//300
//100
//150
//240
//Spain
//1200
//300
//500
//193
//423
//End
//Going to Greece!
//Going to Spaint
import java.util.Scanner;

public class p5_VLOJEN_Пътуване {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // четем команда - дестинация или End
        String comands = scanner.nextLine();
        // спираме да четем команди когато командата = End;
        // продължаваме докато comands != End
        while ( !comands.equals("End")){
             double budjet = Double.parseDouble(scanner.nextLine());
             double money = 0;
             while (money<budjet){
                 double savedMoney = Double.parseDouble(scanner.nextLine());
                 money+=savedMoney;
             }
             System.out.println("Going to " + comands +"!");

              comands = scanner.nextLine();
        }
    }
}
