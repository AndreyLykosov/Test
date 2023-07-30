package Lesson_16;

import java.util.LinkedList;


public class Student {

    private static void studentArrayList(){


        LinkedList<String> student = new LinkedList<>();
        student.add("First");
        student.add("Second");
        student.add("Third");



        String firstElement = student.removeFirst();
        System.out.println("First element: " + firstElement);
    }
}
