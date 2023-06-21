import java.util.Scanner;

    public class Lesson_7 {
        static int getVolume (int a) { //Создаём метод вычисления объема
        System.out.println("*");//Печатаем "*" при обращениии к методу
        return a * a * a;//Возвращаем куб заданного числа
    }
    public static void symbol(char symbol, int b){//Создаем метод сканирования введенного числа
        for(int i = 0; i < b; i++) {//Создаем цикл вывода символов спривязкой к введенному числу
            System.out.println(symbol);//Печатаем символы
        }
    }

    public static void main(String[] args) {//Создаем основной метод
        Scanner scanner = new Scanner(System.in);//Создаем метод сканера числа
        System.out.println("Введите число a");//Печатаем "Введите число a"
        int b = scanner.nextInt();//Вводим число
        int newgetVolume = getVolume(b);//Создаем переменную с обращением к методу расчета куба
        System.out.println("Куб :" + newgetVolume);//Выводим результат расчета куба

        Scanner charScanner = new Scanner(System.in);//Создаем метод сканирования символов
        System.out.println("Введите любой символ" + charScanner);//Вводим любой символ
        char symbol = charScanner.next().charAt(0);//Присваиваем переменной symbol, введенный любой символ
        symbol(symbol, b);//Задействали метод symbol
    }


}
