package study.alishev2.JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapLesson {
    public static void main(String[] args) {

        // Map (словарь) данные-> ключ:значение (key:value)

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");

        System.out.println(map); // {1=Один, 2=Два, 3=Три, 4=Четыре, 5=Пять}

        //порядок вывода случаен

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
