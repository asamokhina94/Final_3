import java.util.Scanner;
import java.lang.Math;

public class Final_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double course = in.nextDouble();
        System.out.print("Количество рублей: ");
        double rub = in.nextDouble();
        double convert;
        convert = (rub/course);
        System.out.printf("Итого: %.2f долларов", convert);   //При выводе происходит округление результата до двух знаков после запятой
    }
}
