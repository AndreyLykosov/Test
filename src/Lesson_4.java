import java.util.Locale;

public class Lesson_4 {
    public static void main(String[] args) {
        String text = "Andrey!" ;

        String UpperCase = text.toUpperCase();//Формируем метод прописывания текста в верхнем регистре
        System.out.println("Пишем в верхнем регистре: "+ UpperCase); //Выводим результат

        String LowerCase = text.toLowerCase(Locale.ROOT);//Формируем метод прописывания текста в нижнем регистре
        System.out.println("Пишем в нижнем регистре: "+ LowerCase);//Выводим результат

        char firstChar = text.charAt(0);//Формируем метод поиска первой буквы
        System.out.println("Первая буква: "+ firstChar);//Выводим результат

        char lastChar = text.charAt(text.length()-2);//Формируем метод поиска последней буквы
        System.out.println("Последняя буква: "+ lastChar);//Выводим результат
        }
}





