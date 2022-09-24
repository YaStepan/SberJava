package secondweekpractice;

import java.util.Scanner;
/*
Дано четырехзначное число. Проверить является ли оно палиндромом.
1881 -> true
101 -> true
5081 -> false
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 999 && n < 10000) {
            int end = n % 10;
            int start = n / 1000;

            if (end != start) {
                System.out.println("не палиндром");
            }
            else {
                end = (n % 100) / 10;
                start = (n / 100) % 10;
                if (end != start) {
                    System.out.println("не палиндром");
                }
                else {
                    System.out.println("палиндром");
                }
            }
        }
        else {
            System.out.println("Ввели некорректное число (4 знака должно быть)");
        }
    }
}



