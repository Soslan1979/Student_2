package study.alishev.lesson_3;

import java.util.HashMap;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>(); // Создание HashMap,

        passportsAndNames.put(900040, "Иванов Иван Иванович"); // Добавление новой пары в HashMap
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        System.out.println(passportsAndNames.containsKey(11111)); // Проверяет наличие какого-то ключа. (false/true)
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп")); // Проверяет наличие какого-то значения.
        passportsAndNames.remove(162348); // Удаления элемента из HashMap
        String lidiaName = passportsAndNames.get(212133); // Доступ к значениям в HashMap осуществляется по ключу
        System.out.println(lidiaName);
        // .putAll() Объединение двух мап в одну
        System.out.println(passportsAndNames);

    }
}
