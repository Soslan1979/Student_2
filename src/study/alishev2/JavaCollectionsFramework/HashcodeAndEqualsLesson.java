package study.alishev2.JavaCollectionsFramework;

import java.util.*;

public class HashcodeAndEqualsLesson {
    public static void main(String[] args) {

        /**
         * Методы hashCode и equals (можно сгенерировать) позволяют сравнить объекты по его полям, а не по ссылке на объект
         * */

        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Katy");
        Person person3 = new Person(2, "Katy"); // Данный экземпляр класса, person3 идентичен person2 по полям класса, но это два объекта с разными ссылками на них

        map.put(person1, "100");
        map.put(person2, "200");
        map.put(person3, "300");

        set.add(person1);
        set.add(person2);
        set.add(person3);

        System.out.println("экземпляр класса: " + person1);
        System.out.println("экземпляр класса: " + person2);
        System.out.println("экземпляр класса: " + person3);

        System.out.println("map: " + map);
        System.out.println("set: " + set);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public String toString(){
//        return "Person{id="+id+", name="+name+"}";
//    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);

    }
}