package HomeWork2;

import java.util.Scanner;

//(1 балл) "А логарифмическое?" - не унималась дочь.
//        Напишите программу, которая проверяет, что log(e^n) == n для любого
//        вещественного n
public class Point10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        System.out.println(Math.log(Math.exp(input))==input);
    }
}
