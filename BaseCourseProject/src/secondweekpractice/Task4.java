package secondweekpractice;
/*
 Считать данные из консоли о типе номера отеля.
 1 VIP, 2 Premium, 3 Standard
 Вывести цену номера VIP = 125, Premium = 110, Standard = 100
 */

import java.util.Scanner;

public class Task4 {
    public static final int VIP_PRICE = 125;
    public static final int PREMIUM_PRICE = 110;
    public static final int STANDARD_PRICE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomType = scanner.nextInt();
        //Стандартное решение через if-else
//        if (roomType == 1) {
//            System.out.println("VIP Price: " + VIP_PRICE);
//        }
//        if (roomType == 2) {
//            System.out.println("Premium Price: " + PREMIUM_PRICE);
//        }
//        if (roomType == 3) {
//            System.out.println("Standard Price: " + STANDARD_PRICE);
//        }
//        else {
//            System.out.println("введите корректный номер");
//        }
//новая версия switch (через лямбды)
//        case 1 -> System.out.println("VIP Price: " + VIP_PRICE);
//        case 2 -> System.out.println("Premium Price: " + PREMIUM_PRICE);
//        case 3 -> System.out.println("Standard Price: " + STANDARD_PRICE);
//        default -> System.out.println("введите корректный номер");
//стандартная версия switch (поддерживается всеми версиями java)
        switch (roomType) {
            case 1:
                System.out.println("VIP Price: " + VIP_PRICE);
                break;
            case 2:
                System.out.println("Premium Price: " + PREMIUM_PRICE);
                break;
            case 3:
                System.out.println("Standard Price: " + STANDARD_PRICE);
                break;
            default:
                System.out.println("введите корректный номер");
                break;
        }
    }
}

