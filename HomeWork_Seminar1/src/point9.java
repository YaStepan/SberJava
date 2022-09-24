import java.util.Scanner;

public class point9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();//общий бюджет
        double k = sc.nextDouble();//бюджет на 1 гостя
        int guestNumber = (int)(n/k);
        System.out.println(guestNumber);
    }
}
