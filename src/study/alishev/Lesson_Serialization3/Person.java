package study.alishev.Lesson_Serialization3;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private /*transient*/ String name; // transient позволяет не Serializable поле
                                    // (при считывании (если ссылочный/примитив тип данных) возвращает null/0)
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "id: " + id + ", " + "Name: " + name;
    }
}
