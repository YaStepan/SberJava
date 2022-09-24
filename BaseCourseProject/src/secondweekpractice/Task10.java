package secondweekpractice;
/*
Дана последовательность символов, конкатенировать их в одну строку и вывести эту строку, исключая цифры.
На вход подаются заглавные или строчные символы английского алфавита или цифры.
Scanner input = new Scanner(System.in);
String a1 = input.next();
String a2 = input.next();
String a3 = input.next();
String a4 = input.next();
String a5 = input.next();

Входные данные
H 1 9 i 4
Выходные данные
Hi
 */

import java.util.Scanner;


public class Task10 {
    public static String res = "";
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    char a1 = input.next().charAt(0);
    char a2 = input.next().charAt(0);
    char a3 = input.next().charAt(0);
    char a4 = input.next().charAt(0);
    char a5 = input.next().charAt(0);

    numDeletion(a1);
    numDeletion(a2);
    numDeletion(a3);
    numDeletion(a4);
    numDeletion(a5);
    System.out.println(res);


//        if ((a1 >= 'a' && a1 <= 'z') || (a1 >= 'A' && a1 <= 'Z')) {
//            res += a1;
//        }
//        if ((a2 >= 'a' && a2 <= 'z') || (a2 >= 'A' && a2 <= 'Z')) {
//            res += a2;
//        }
//        if ((a3 >= 'a' && a3 <= 'z') || (a3 >= 'A' && a3 <= 'Z')) {
//            res += a3;
//        }
//        if ((a4 >= 'a' && a4 <= 'z') || (a4 >= 'A' && a4 <= 'Z')) {
//            res += a4;
//        }
//        if ((a5 >= 'a' && a5 <= 'z') || (a5 >= 'A' && a5 <= 'Z')) {
//            res += a5;
//        }

    


    }
    public static String numDeletion(char i){
        if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
            res += i;

        }
        return res;
    }
}
