import java.util.ArrayList;
import java.util.LinkedList;
public class Lesson_16 {
    static void main(String[] args) {

        long start = System.currentTimeMillis();
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersArrayList.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("arraylist" + " " + (end-start));

    }
   
}
