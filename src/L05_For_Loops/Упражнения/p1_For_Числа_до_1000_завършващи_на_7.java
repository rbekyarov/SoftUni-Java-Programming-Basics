package L05_For_Loops.Упражнения;//числа до 1000, завършващи на 7
//Да се напише програма, която намира всички числа в интервала [1 … 1000], които завършват на 7.

public class p1_For_Числа_до_1000_завършващи_на_7 {
    public static void main(String[] args) {
        /*for (int i = 1; i < 1000 ; i++) {
            if(i %10 ==1){
                System.out.println(i);
            }


        }*/

        for (int i = 7; i <=997 ; i+=10) {
            System.out.println(i);

        }
    }
}
