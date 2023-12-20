package lab11.num5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 100000;
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertTime = endTime - startTime;
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListInsertTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;

        int targetElement = n / 2;
        startTime = System.nanoTime();
        boolean arrayListContains = arrayList.contains(targetElement);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean linkedListContains = linkedList.contains(targetElement);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;

        System.out.println("Результаты сравнения производительности:");
        System.out.println("Вставка в ArrayList: " + arrayListInsertTime + " нс");
        System.out.println("Вставка в LinkedList: " + linkedListInsertTime + " нс");
        System.out.println("Удаление из ArrayList: " + arrayListRemoveTime + " нс");
        System.out.println("Удаление из LinkedList: " + linkedListRemoveTime + " нс");
        System.out.println("Поиск по образцу в ArrayList: " + arrayListSearchTime + " нс");
        System.out.println("Поиск по образцу в LinkedList: " + linkedListSearchTime + " нс");
    }
}
