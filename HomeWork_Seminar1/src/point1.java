import java.util.Scanner;

public class point1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double V = 4.0/3*Math.PI*Math.pow(radius,3);
        System.out.printf("Если радиус шара = %s, то объем шара =%s",radius,V);
    }
}
