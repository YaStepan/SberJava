package HomeWork2;

import java.util.Scanner;

//(1 балл) Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
//        нужно проверить, имеет ли предложенное квадратное уравнение решение или
//        нет.
//        На вход подаются три числа — коэффициенты квадратного уравнения a, b, c.
//        Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.
public class Point5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        double discriminant=Math.pow(b,2)-4*a*c;
        String result = discriminant<0?"Решения нет":"Решение есть";
        System.out.println(result);
    }
}
