package study.alishev2.JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator - сортировка
 * */

public class ComparatorLesson {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Turtle");
        animals.add("Rat");
        animals.add("Bear");
        animals.add("Sheep");
        animals.add("Dog");
        animals.add("Leopard");

        Collections.sort(animals); // сортировка по умолчанию
        System.out.println(animals);

        Collections.sort(animals, new StringLenghtComparator()); // переопределенная сортировка, свой метод StringLenghtComparator
        System.out.println(animals);

        List<Integer> number = new ArrayList<>();

        number.add(35);
        number.add(5);
        number.add(10);
        number.add(75);
        number.add(15);
        number.add(90);
        number.add(1);

        Collections.sort(number, new BackwardsIntegerComparator()); // переопределенная сортировка, свой метод BackwardsIntegerComparator
        System.out.println(number);

        //Реализация через анонимный класс Comparator<Integer>()
        Collections.sort(number, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return -1;
                }
                else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(number + " реализация через анонимный класс Comparator<Integer>()");
    }
}

class StringLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()){
            return 1;
        }
        else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2){
            return -1;
        }
        else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}