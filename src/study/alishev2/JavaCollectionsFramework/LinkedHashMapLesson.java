package study.alishev2.JavaCollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapLesson {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); // вывод в случайном порядке
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // вывод в том порядке в котором внесено
        Map<Integer, String> treeMap = new TreeMap<>(); // вывод в сортировке по ключу

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(30, "Tom");
        map.put(7, "Nick");
        map.put(21, "Jack");
        map.put(5, "Max");
        map.put(47, "Peter");
        map.put(1, "Jhon");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("===============");
    }
}
