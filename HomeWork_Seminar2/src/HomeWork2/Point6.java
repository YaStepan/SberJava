package HomeWork2;
//(1 балл) На следующий день на работе Петю и его коллег попросили заполнить
//        анкету. Один из вопросов был про уровень владения английского. Петя и его
//        коллеги примерно представляют, сколько они знают иностранных слов. Также у
//        них есть табличка перевода количества слов в уровень владения английском
//        языком. Было бы здорово автоматизировать этот перевод!
//        На вход подается положительное целое число count - количество выученных
//        иностранных слов. Нужно вывести какому уровню соответствует это количество.

import java.util.Scanner;

public class Point6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String level=input<500?"beginner":input>=500&&input<1500?"pre-intermediate":input>=1500&&input<2500?"in" +
                "termediate":input>=2500&&input<3500?"upper-intermediate":"fluent";
        System.out.println(level);
        }

}
