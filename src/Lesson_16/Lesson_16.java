package Lesson_16;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson_16 {

    public static void main(String[] args) {
        arrayList();
        linkedList();
    }

    private static void arrayList() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
            System.out.println("ArrayList " + integerList.get(i - 1));
        }
    }

    private static void linkedList() {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 2000000; i++) {
            numbers.add(i);
            System.out.println("LinkedList " + numbers.get(i - 1));
        }
    }
}

   

