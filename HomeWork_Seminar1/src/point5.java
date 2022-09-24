import java.util.Scanner;

public class point5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch = sc.nextDouble();
        double centimetres   = inch*2.54;
        System.out.println(centimetres);
    }
}
