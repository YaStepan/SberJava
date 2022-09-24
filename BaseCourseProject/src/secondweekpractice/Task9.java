package secondweekpractice;
/*
   Дана строка и паттерн, заменить паттерн на паттерн, состоящий из заглавных символов
   Входные данные
   Hello
   o
   Выходные данные
   HellO

   Входные данные
   Hello world
   ld
   Выходные данные
   Hello worLD
    */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine().toUpperCase();
//
//        System.out.println(str1.replace(str2.toLowerCase(),str2.toUpperCase()));

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.next();

        String upperPattern = pattern.toUpperCase();
        System.out.println(str.replace(pattern, upperPattern));


    }
}
