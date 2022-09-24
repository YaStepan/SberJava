package secondweekpractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str;

//        if (n % 2 == 0) {
//            str = " число четное";
//        }
//        else {
//            str = " число нечетное";
//        }
        //тернарный оператор как альтернатива if-else
        str = (n % 2 == 0) ? " число четное" : " число нечетное";

        System.out.println(n + str);
    }

}
