package secondweekpractice;
/*
Реализовать System.out.println(), используя System.out.print() и табуляцию \n
Входные данные: два слова, считываемые из консоли

Входные данные
Hello World
Выходные данные
Hello
World

 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String n1 = scan.next();
        String n2 = scan.next();

        System.out.print(n1+"\n" + n2);
    }
}
