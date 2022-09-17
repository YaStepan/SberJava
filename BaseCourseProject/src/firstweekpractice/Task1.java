package firstweekpractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Результат ввода a=" + a + ";b=" + b + ";c=" + c);
        //System.out.println("3 + 2=" + (3 + 2));
        int temp = c;
        c = b;
        b = a;
        a = temp;

        System.out.println("Результат работы программы: a=" + a + ";b=" + b + ";c=" + c);
        System.out.printf("a = %s, b = %s, c = %s", a, b, c);
    }

}
