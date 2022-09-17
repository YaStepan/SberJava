package firstweekpractice;
/*

Дана площадь круга, нужно найти диаметр окружности и длину окружности.
S  = PI * (D^2 / 4) - это через диаметр => d = sqrt(S * 4 / PI)
S = PI * r^2 - радиус
S = L^2 / (4 *PI) - площадь через длину
Отношение длины окружности к диаметру является постоянным числом.
π = L : d

Входные данные:
91
 */

public class Task4 {
    public static void main(String[] args) {
        int s = 91;

        double d = Math.sqrt(s/Math.PI)*2;
        double l = Math.sqrt(s*(4*Math.PI));
        System.out.printf("d = %s; l = %s",d,l);
    }
}
