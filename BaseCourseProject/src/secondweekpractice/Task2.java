package secondweekpractice;
/*
Дано число n.
Если оно четное и больше либо равно 0, то вывести “Четное больше или равно 0”.
Если четное и меньше 0, то вывести “Четное меньше 0”.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = "";

//        if (n % 2 == 0 && n>=0) {
//            str = " число четное больше или равно 0";
//        }
//        else if(n % 2 == 0 && n<0) {
//            str = " число четное меньше 0";
//        }
//        else {
//            str = " число нечетное";
//        }
        if(n%2==0){
                if(n>=0){
                    str = " число четное больше или равно 0";
                }
                if(n<0) {
                    str = " число четное меньше 0";
                }
            }



        System.out.println(n + str);
    }
}
