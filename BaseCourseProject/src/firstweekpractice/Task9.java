package firstweekpractice;
/*
     Даны целые числа a, b и с, определяющие квадратное уравнение. Вычислить дискриминант.

     Подсказка: D = b^2 - 4 * a * c

     Входные данные
     a = 6 b = -28 с = 79
     */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("Дискриминант равен: %s",Math.pow(b,2)-4*a*c);
    }
}
