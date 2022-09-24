import java.util.Scanner;

public class point2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double res = Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
        System.out.printf("При a = %s и b = %s среднее квадратическое  = %s",a,b,res);
    }
}
