package study.alishev2.JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** ArrayList быстрее LinkedList при записи данных в конец массива и гораздо быстрее при считывании данных из массива
 * данные в массиве [1][2][3][4][5]
 * индексы           0  1  2  3  4
 *
 * LinkedList состоит из узлов в котором содержится значение(данные) и ссылка на предыдущий и следующий узел,
 * по этому добавление данных в начало массива и удаление данных из массива происходит быстрее
 * head-> [1]->[2]->[3]->[4]->[5] односвязный список
 * head<=> [1]<=>[2]<=>[3]<=>[4]<=>[5] двух связный список */

public class LinkedListLesson {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(); // Имеет те же методы, что и Arraylist (add, get, remove, size)
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
