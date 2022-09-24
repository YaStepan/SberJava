package secondweekpractice;
/*
Даны три числа a, b, c.
Найти сумму двух чисел больших из них.
Входные данные
21 0 8
Выходные данные
29
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int n1, n2;
//        n1 = a>b?a:b;
//        n2 = a>c&&n1!=a?a:c;
//        System.out.println((n1+n2));
//    }
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum;
        if (a <= b && a <= c) {
            sum = b + c;
        }
        else if (b <= a && b <= c) {
            sum = a + c;
        }
        else {
            sum = a + b;
        }
        System.out.println(sum);

        System.out.println(Math.max(Math.max(a + b, b + c), a + c));
    }

}
