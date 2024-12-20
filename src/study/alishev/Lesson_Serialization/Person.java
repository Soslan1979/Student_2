package study.alishev.Lesson_Serialization;

import java.io.Serializable;

public class Person implements Serializable { // Интерфейс Serializable(не имеет методов) позволяет записывать объекты в файл
    private int id;
    private String name;

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
