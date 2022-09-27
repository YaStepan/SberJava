package HomeWork2;

import java.util.Scanner;

//(1 балл) Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
//        Ему хочется уметь разделять строку по первому пробелу. Для этого он может
//        воспользоваться методами indexOf() и substring().
//        На вход подается строка. Нужно вывести две строки, полученные из входной
//        разделением по первому пробелу.
public class Point7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.substring(0,text.indexOf("\s"))+"\n"+text.substring(text.indexOf("\s")+1,text.length()));
    }
}
