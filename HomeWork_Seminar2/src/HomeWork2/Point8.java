package HomeWork2;
//(1 балл) Раз так легко получается разделять по первому пробелу, Петя решил
//        немного изменить предыдущую программу и теперь разделять строку по
//        последнему пробелу.

import java.util.Scanner;

public class Point8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.substring(0,text.lastIndexOf("\s"))+"\n"+text.substring(text.lastIndexOf("\s")+1,text.length()));
    }
}
