package HomeWork2;
//(1 балл) Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
//        обед строго после полудня. Периодически он посматривает на часы (x - час,
//        который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
//        время больше полудня, то вывести "Пора". Иначе - “Рано”.

import java.util.Scanner;

public class Point3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        x%=24;
        if(x>12){
            System.out.println("Пора");
        }
        else{
            System.out.println("Рано");
        }
    }
}
