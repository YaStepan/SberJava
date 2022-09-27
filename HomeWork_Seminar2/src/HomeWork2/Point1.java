package HomeWork2;

import java.util.Scanner;

//1. (1 балл) За каждый год работы Петя получает на ревью оценку. На вход
//        подаются оценки Пети за последние три года (три целых положительных числа).
//        Если последовательность оценок строго монотонно убывает, то вывести "Петя,
//        пора трудиться"
//        В остальных случаях вывести "Петя молодец!"
//        Ограничения:
//        0 < a, b, c < 100
public class Point1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a>b&&b>c?"Петя, пора трудиться":"Петя молодец!");

    }
}
