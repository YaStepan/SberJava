package HomeWork2;
//Дополнительные задачи
//        1. (2 балла) У Марата был взломан пароль. Он решил написать программу,
//        которая проверяет его пароль на сложность. В интернете он узнал, что пароль
//        должен отвечать следующим требованиям:
//        a) пароль должен состоять из хотя бы 8 символов;
//b) в пароле должны быть:
//        - заглавные буквы
//        - строчные символы
//        - числа
//        - специальные знаки(_*-)
//        Если пароль прошел проверку, то программа должна вывести в консоль строку пароль
//        надежный, иначе строку: пароль не прошел проверку

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddTask1 {
    static boolean hasUpCaseLetters=false,hasLowCaseLetters=false,hasNumbers=false,hasSpecSymbols = false;
    static Pattern numbers = Pattern.compile("\\d");
    static Pattern upLetters = Pattern.compile("[A-Z]");
    static Pattern lowLetters = Pattern.compile("[a-z]");
    static Pattern specSym = Pattern.compile("[_*-]");
    static String result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(passCheckerCycle(input));
        System.out.println(passCheckerRegs(input));

     }
     public static String passCheckerCycle(String pw){
         hasLowCaseLetters=hasUpCaseLetters=hasNumbers=hasSpecSymbols=false;//эти переменные +
         // отвечают за конечный результат совместно с input.length()
         char n;
         for(int i = 0;i<pw.length();i++){
             n=pw.charAt(i);
             if(n>='a'&&n<='z')hasLowCaseLetters =true;
             if(n>='A'&&n<='Z')hasUpCaseLetters = true;
             if(n>='0'&&n<='9')hasNumbers=true;
             if(n=='_'||n=='*'||n=='-')hasSpecSymbols=true;

         }
         result = pw.length()>=8&&hasLowCaseLetters==true&&hasUpCaseLetters==true&&hasNumbers==true&&hasSpecSymbols==true?
                  "пароль надежный":"пароль не прошел проверку";
         return result;
     }

     public static String passCheckerRegs(String pw){

         hasNumbers = numbers.matcher(pw).find();
         hasUpCaseLetters = upLetters.matcher(pw).find();
         hasLowCaseLetters = lowLetters.matcher(pw).find();
         hasSpecSymbols = specSym.matcher(pw).find();
         result = pw.length()>=8&&hasLowCaseLetters==true&&hasUpCaseLetters==true&&hasNumbers==true&&hasSpecSymbols==true?
                 "пароль надежный":"пароль не прошел проверку";



        return result;
    }
}
