package firstweekpractice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("a=%s,b=%s", a, b);
        System.out.println();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("a=%s,b=%s", a, b);

    }
}
