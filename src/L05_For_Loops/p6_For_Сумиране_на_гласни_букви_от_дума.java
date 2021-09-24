package L05_For_Loops;//Пример: сумиране на гласните букви
//Да се напише програма, която въвежда текст (стринг), изчислява и отпечатва сумата от стойностите на гласните букви според таблицата по-долу: a e i o u 1 2 3 4 5
//Примерен вход и изход
//Вход Изход Вход Изход hello 6 (e+o = 2+4 = 6) bamboo 9 (a+o+o = 1+4+4 = 9) hi 3 (i = 3) beer 4 (e+e = 2+2 = 4)
import java.util.Scanner;

public class p6_For_Сумиране_на_гласни_букви_от_дума {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    int sum =0;
    for (int i=0  ; i<=text.length() -1  ;i=i+1){
        char simbol = (text.charAt(i));

        switch (simbol){
            case 'a':
                sum+=1;break;
            case 'e':
                sum+=2;break;
            case 'i':
                sum+=3;break;
            case 'o':
                sum+=4;break;
            case 'u':
                sum+=5;break;
        }

    }System.out.println(sum);

}
}

