package firstweekpractice;
/*
     Перевод литров в галлоны. С консоли считывается число n - количество литров, нужно перевести это число в галлоны.
     (1 литр = 0,219969 галлона)
     */

import java.util.Scanner;

public class Task7 {
    static final double LITRES_IN_GALLON = 0.219969;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = n * LITRES_IN_GALLON;
        System.out.println("Результат: " + res);
    }
}

