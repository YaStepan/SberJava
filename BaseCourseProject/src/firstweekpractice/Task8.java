package firstweekpractice;

import java.util.Scanner;

/*
Дано целое число n.
Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную инструкцию if и циклы.

5 -> 6
10 -> 12
*/
public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = (n / 2 + 1) * 2;
        int res1 = n + 2 - Math.abs(n) % 2;

        System.out.println("Результат: " + res);
        System.out.println("Результат: " + res1);
    }
}

