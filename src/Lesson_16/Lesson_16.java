package Lesson_16;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Lesson_16 {
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();

        // Добавляем студентов в список
        students.add(new Student("Иван", 20));
        students.add(new Student("Мария", 19));
        students.add(new Student("Петр", 22));

        // Выводим список студентов на экран
        for (Student student : students) {
            System.out.println(student);
        }
    }
}




   

