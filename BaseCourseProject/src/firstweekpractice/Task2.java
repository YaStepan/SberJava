package firstweekpractice;

import java.util.Scanner;
/*
      Дано m - количество гигабайт трафика, используемое пользователем за месяц,
      с - заплаченная цена за этот трафик.
      Вычислить стоимость одного гигабайта трафика.

      Входные данные
      1) m = 2, c = 22
      2) m = 3, c = 22
     */
// 1 гб -> m:c = 1:x => m/c = 1/x => x = c * 1 / m.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Стоимость 1ГБ трафика: " + c * 1.0 / m);
        System.out.println("Стоимость 1ГБ трафика(v2): " + (double) c / m);
        System.out.println("Стоимость 1ГБ трафика(v3): " + c * 1D / m);
    }






}

