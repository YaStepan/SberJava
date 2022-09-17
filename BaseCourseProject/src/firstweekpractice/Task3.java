package firstweekpractice;
/*
    Напишите программу, которая получает два числа с плавающей точкой х и у в аргументах
    командной строки и выводит евклидово расстояние от точки (х, у) до точки (0, 0)

    Входные данные
    i = 7 j = 5
     */
/*Евклидово расстояние - это расстояние между двумя точками, вычисляемое по теореме Пифагора.
        (сумма квадратов длин катетов равна квадрату длины гипотенузы.)
        корень квадратный из суммы квадратов x2-x1 и y2-y1
        d = sqrt((x2-x1)^2 + (y2-y1)^2)*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        double result = Math.sqrt(Math.pow(i,2)+Math.pow(j,2));
        System.out.printf("Евлидово расстояние между точками (0,0) и (%s,%s) = %s",i,j,result);



    }
}
