package secondweekpractice;
/*
Дан символ, поменять со строчного на заглавный или с заглавного на строчный

Входные данные
d
Выходные данные
D
Входные данные
A
Выходные данные
a
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();
        char inpChar = inp.charAt(0);
        System.out.println(inpChar >='a'  &&  inpChar<='z'?inp.toUpperCase().charAt(0):inp.toLowerCase().charAt(0));
        System.out.println(inpChar >='a'  &&  inpChar<='z'?Character.toUpperCase(inpChar):Character.toLowerCase(inpChar));
//      3 вариант:
//        String symbol = scanner.next();
//        char c = symbol.charAt(0);
//
//        if (c >= 'a' && c <= 'z'){
//            System.out.println((char) (c + ('A' - 'a')));
//        } else {
//            System.out.println((char) (c - ('A' - 'a')));
        }

}

