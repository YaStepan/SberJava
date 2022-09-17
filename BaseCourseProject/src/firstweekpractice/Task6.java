package firstweekpractice;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Дано двузначное число. Вывести сначала левую цифру (единицы), затем правую (десятки)
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целочисленный литерал:");
        int c = sc.nextInt();
        System.out.println("Результат:");
        System.out.printf("Единицы: %s; десятки: %s",c%10,c/10);
    }
}
