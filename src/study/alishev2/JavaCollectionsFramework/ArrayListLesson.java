package study.alishev2.JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * Java collections framework — это набор связанных классов и интерфейсов,
реализующих широко используемые структуры данных — коллекции.
 */

public class ArrayListLesson {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(); // Создаем массив, без заданного размера.

        for (int i = 0; i < 10; i++) {
            array.add(i); // .add метод добавления данных в массив
        }

        for (Integer data : array) { // в цикле вывели все данные массива
            System.out.println(data);
        }
        System.out.println(array);
        System.out.println(array.get(0)); // get, метод получения данных в массиве по индексу
        System.out.println(array.remove(5)); // remove, метод удаления данных в массиве по индексу
        System.out.println(array);                // remove не эффективен при удалении данных в начале или середине массива
        System.out.println(array.size()); // size, метод получения размера массива
    }
}
