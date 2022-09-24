package secondweekpractice;
/*
Даны три целых числа a, b, c.
Проверить есть ли среди них прямо противоположные.
( 5 и -5 прямо противоположные числа).
0 и 0 не считать прямо противоположными.
Входные данные
-1 1 0
Выходные данные
true
Входные данные
-2 1 0
Выходные данные
false
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a+b == 0 && a != 0 || b+c == 0 && b!=0 || a+c ==0 && c!=0)?"true":"false");
        System.out.println((a == -b && a != 0) || (a == -c && a != 0) || (b == -c && b != 0));

    }
}
