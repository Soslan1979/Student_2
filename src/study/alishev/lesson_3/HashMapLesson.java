package study.alishev.lesson_3;

import java.util.HashMap;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>(); // Создание HashMap,
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(900040, "Иван Иванович Иванов"); // Добавление новой пары в HashMap
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Алексей Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        passportsAndNames2.put(9992771, "Михаил Сергеевич Горбачев");
        passportsAndNames2.put(4524771, "Борис Николаевич Ельцин");

        System.out.println(passportsAndNames.containsKey(11111)); // Проверяет наличие какого-то ключа. (false/true)
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп")); // Проверяет наличие какого-то значения.
        passportsAndNames.remove(900040); // Удаления элемента из HashMap
        System.out.println(passportsAndNames);
        String lidiaName = passportsAndNames.get(212133); // Доступ к значениям в HashMap осуществляется по ключу
        System.out.println(lidiaName);
        passportsAndNames.putAll(passportsAndNames2); // Объединение двух мап в одну
        System.out.println(passportsAndNames);
    }
}
