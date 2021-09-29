package L07_Nested_Loops;

public class p1_VLOJEN_Часовник_ {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23 ; hour++) {
            for (int minute = 0; minute <=59 ; minute++) {
               System.out.printf("%d:%d\n",hour ,minute);
            }
        }
    }
}
