package Currency_prj;

import java.util.Scanner;

public class Currency_project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //определяем курс рубля к юаню на 16_09_2022
        final double Roubles_per_CNY = 8.32;
        //входные данные - получить сумму денег в юанях
        int n;
        do {
            System.out.println("Введите корректное количество конвертаций:");
            n = input.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите сумму в юанях (целое число):");
            int cny = input.nextInt();
            //прописываем правильное окончание названия валюты введенной суммы
            int lastOneDigit = cny % 10;
            int lastTwoDigits = cny % 100;
            String endOfCNY = ""; //переменная с корректным окончанием единицы CNY
            if (lastTwoDigits <= 14 && lastTwoDigits >= 11) {
                endOfCNY = "китайских юаней составят ";
            } else if (lastOneDigit == 1) {
                endOfCNY = "китайский юань составит ";
            } else if (lastOneDigit >= 2 && lastOneDigit <= 4) {
                endOfCNY = "китайских юаня составят ";
            } else if (lastOneDigit >= 5 && lastOneDigit <= 9 || lastOneDigit == 0) {
                endOfCNY = "китайских юаней составят ";
            }
            //переводим юани в рубли
            double roubles = cny * Roubles_per_CNY;


            //выводим сумму в рублях. У юаней ставим окончание
            System.out.println(cny + " " + endOfCNY + (int) roubles + " руб. " + (int) (roubles % (int) roubles * 100)
                    + " коп.");
        }
    }
}
