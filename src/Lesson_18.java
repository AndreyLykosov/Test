import java.util.*;

public class Lesson_18 {
    public static void main(String[] args) {
        int numberOfIterations = 1000;
        int rangeMin = 1;
        int rangeMax = 50;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Random random = new Random();

        for (int i = 0; i < numberOfIterations; i++) {
            int randomNumber = random.nextInt(rangeMax - rangeMin + 1) + rangeMin;

            hashSet.add(randomNumber);
            treeSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
        }

        System.out.println("HashSet:");
        printSet(hashSet);

        System.out.println("\nTreeSet:");
        printSet(treeSet);

        System.out.println("\nLinkedHashSet:");
        printSet(linkedHashSet);
    }

    private static void printSet(Set<Integer> set) {
        for (Integer number : set) {
            System.out.print(number + " ");
        }
    }
}
