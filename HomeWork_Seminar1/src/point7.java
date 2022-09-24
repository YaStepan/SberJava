import java.util.Scanner;

public class point7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit= input.nextInt();
        int dozens = digit/10;
        int units = digit%10;

        System.out.println(String.valueOf(units)+String.valueOf(dozens));
    }
}
