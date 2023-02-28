import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        TODO HOME WORK #15.2
//        Circle деген класс түзүңүз, анын PI деген свойствасы,
//                area жана circumference деген статик методдору болсун.
//        area ны табуу үчүн: PI * (radius * radius)
//        circumference ти табуу үчүн PI * 2 * radius деген формулалар колдонулат
        int a = new Scanner(System.in).nextInt();
        System.out.println("Area:"+Circle.area(a));
        System.out.println("circumference:"+Circle.circumference(a));
    }
}