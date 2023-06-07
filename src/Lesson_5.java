import java.util.Scanner;

public class Lesson_5
{
    public static void main (String[] args ) {//Создаем класс
        Scanner scanner = new Scanner(System.in);//Cоздаём метод scanner
        System.out.println("Enter а (0...10):");//Печатает запрос на ввод числа а
        int a = scanner.nextInt();//сканируем число a
        System.out.println("Enter b (0..10):");//Печатает запрос на ввод числа b
        int b = scanner.nextInt();//сканируем число b

        if (a < b) {//Еслм а<b, выводим на печать
            System.out.println(a + "<" + b);//Печатаем результат
        }
        if (b < a) {//Еслм b>a, выводим на печать
            System.out.println(a + ">" + b);//Печатаем результат
        }
        if (a == b) {//Еслм a=b, выводим на печать
            System.out.println(a + "=" + b);//Печатаем результат
        }
    }
}
