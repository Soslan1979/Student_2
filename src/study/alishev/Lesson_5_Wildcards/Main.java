package study.alishev.Lesson_5_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>(); // Создали изменяемый массив
        listAnimal.add(new Animal(1)); // Создали объекты класса Animal со значением id
        listAnimal.add(new Animal(2));

        List<Dog> listDog = new ArrayList<>(); // Создали изменяемый Dog
        listDog.add(new Dog(11)); // Создали объекты класса Dog со значением id
        listDog.add(new Dog(22));

        test(listAnimal);
        test(listDog);
    }

    public static void test(List<? extends Animal> list) {
        for (Animal animal : list){
            System.out.println(animal);
            animal.eat();
        }

    }
}
