package L06_While_Loops.Упражнения;
/*
1.	Старата Библиотека
        Ани отива до родния си град след много дълъг период извън страната.
        Прибирайки се вкъщи, тя вижда старата библиотека на баба си и си спомня за любимата си книга.
        Помогнете на Ани, като напишете програма, в която тя въвежда търсената от нея книга (текст).
        Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
        програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст),
         която тя проверява. Книгите в библиотеката са свършили щом получите текст “No More Books”.
        •	Ако не открие търсената книгата да се отпечата на два реда:
        o	"The book you search is not here!"
        o	"You checked {брой} books."
        •	Ако открие книгата си се отпечатва един ред:
        o	"You checked {брой} books and found it."
*/
import java.util.Scanner;

public class p1_While_Старата_Библиотека {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookSearch = scanner.nextLine();
        int count = 0;
        boolean search = false;
        String bookRead = scanner.nextLine();

        while (!(bookRead.equals("No More Books"))) {
           if (bookRead.equals(bookSearch)) {
               search = true;
               break;
           }
           count++;
           bookRead = scanner.nextLine();
        }
        if (search){
            System.out.printf("You checked %d books and found it.",count);

        } else {
            System.out.println("The book you search is not here!");
            System.out.println("You checked " + count +" books.");
        }

    }
}
