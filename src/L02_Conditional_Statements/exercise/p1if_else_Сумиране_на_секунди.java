package Kurs5Проверки.Упражнения;//Задача: сумиране на секунди
//Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
// Да се напише програма, която въвежда времената на състезателите и пресмята сумарното им време във формат "минути:секунди".
// Секундите да се изведат с водеща нула (2 → "02", 7 → "07", 35 → "35").
//Примерен вход и изход Вход Изход
//Вход Изход
//Вход Изход
//Вход Изход 35 45 44 2:04 22 7 34 1:03 50 50 49 2:29
//14 12 10
//0:36

import java.util.Scanner;

public class p1if_else_Сумиране_на_секунди {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int z = Integer.parseInt(scanner.next());
        int totalSec = x+y+z;
        int sec = 0;
        if( totalSec < 60){
            sec=totalSec;
            if (sec < 10){
                System.out.printf("0:0%d", sec);
            } else {
                System.out.printf("0:%d", sec);
            }
            }
            else if (totalSec < 120) {
                sec = totalSec-60;
                if(sec < 10) {
                    System.out.printf("1:0%d", sec);
                } else {
                    System.out.printf("1:%d", sec);
                }
                }
            else {
                    sec = totalSec-120;
                    if (sec < 10) {
                        System.out.printf("2:0%d", sec);
                    } else {
                        System.out.printf("2:%d", sec);
                    }
                }
            }
        }


