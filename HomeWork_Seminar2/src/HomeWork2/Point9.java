package HomeWork2;

import java.util.Scanner;
//(1 балл) Пока Петя практиковался в работе со строками, к нему подбежала его
//        дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
//        cos^2(x) - 1 == 0) всегда-всегда выполняется?"
//        Напишите программу, которая проверяет, что при любом x на входе
//        тригонометрическое тождество будет выполняться (то есть будет выводить true
//        при любом x).



public class Point9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angleRad = scanner.nextDouble()*Math.PI/180;
        double sinOfAngle = Math.sin(angleRad);
        double cosOfAngle = Math.cos(angleRad);
        System.out.println(Math.pow(sinOfAngle,2)+Math.pow(cosOfAngle,2)-1==0);
    }
}
