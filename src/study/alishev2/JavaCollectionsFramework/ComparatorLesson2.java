package study.alishev2.JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLesson2 {
    public static void main(String[] args) {
        List<Person2> person = new ArrayList<>();

        person.add(new Person2("Tom", 30));
        person.add(new Person2("John", 50));
        person.add(new Person2("David", 40));
        person.add(new Person2("Jack", 10));
        person.add(new Person2("Eric", 20));

        Collections.sort(person, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                } else  if (o1.getId() < o2.getId()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println(person);
    }
}

class Person2 {
    private String name;
    private int id;

    public Person2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}