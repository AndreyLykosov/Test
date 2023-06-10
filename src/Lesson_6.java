public class Lesson_6 {
   //Программа для вывода чисел от 1 до10
    public static void main(String[] args) {//Создаем класс
        System.out.println("Числа от 1 до 10");//Заглавие
        for (int A = 1; A < 11; A++) {//Создаем цикл с увеличение следующего числа на 1
            System.out.println(A);//Выводим результат
        }
    }

    public static void Double_numbers(String[] args) {
        System.out.println("Парные числа от 1 до 100");
        for (int B = 1; B < 100; B++) {
            if (B % 2 == B) {
                System.out.println("B" + B);
            }
        }
    }
}
