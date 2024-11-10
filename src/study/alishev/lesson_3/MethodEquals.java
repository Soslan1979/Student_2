package study.alishev.lesson_3;

public class MethodEquals {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);

        System.out.println(animal1.equals(animal2));
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) { // переопределяем метод equals в классе Animal
        Animal animal = (Animal) obj;
        return this.id == animal.id;
    }
}