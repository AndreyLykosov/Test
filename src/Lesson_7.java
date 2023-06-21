import java.util.Scanner;

    public class Lesson_7 {
        static int getVolume (int a) { //Создаём метод вычисления объема
        System.out.println("*");//Печатаем "*" при обращениии к методу
        return a * a * a;//Возврвшаем куб заданного числа
    }
    public static void symbol(char symbol, int b){
        for(int i = 0; i < b; i++) {
            System.out.println(symbol);
        }
    }

    public static void main(String[] args) {//Создаем основной метод
        Scanner scanner = new Scanner(System.in);//Создаем сканер числа
        System.out.println("Введите число a");//Вводим ч
        int b = scanner.nextInt();
        int newgetVolume = getVolume(b);
        System.out.println("Куб :" + newgetVolume);

        Scanner charScanner = new Scanner(System.in);
        System.out.println("Введите любой символ" + charScanner);
        char symbol = charScanner.next().charAt(0);
        symbol(symbol, b);
    }


}
