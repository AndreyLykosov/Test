import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson_19 {
    public static void main(String[] args) {
        // Создаем HashMap для хранения переводов слов
        Map<String, String[]> translationMap = new HashMap<>();

        // Добавляем слова и их переводы
        translationMap.put("Привіт", new String[]{"Hello", "こんにちは", "Hallo"});
        translationMap.put("Дякую", new String[]{"Thank you", "ありがとうございました", "Danke"});
        // Добавьте остальные слова и переводы аналогичным образом

        // Читаем слово от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово на українській мові: ");
        String wordUkr = scanner.nextLine();

        // Поиск перевода в HashMap и вывод на консоль
        if (translationMap.containsKey(wordUkr)) {
            String[] translations = translationMap.get(wordUkr);
            System.out.println("Переклад на англійську: " + translations[0]);
            System.out.println("Переклад на японську: " + translations[1]);
            System.out.println("Переклад на німецьку: " + translations[2]);
        } else {
            System.out.println("Переклад для даного слова не знайдений.");
        }
    }
}
