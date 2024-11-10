package study.alishev.Lesson_4;

public class MainLesson {
    public static void main(String[] args) {
        Animal animal = new Animal(); // I am eating, Animal sleeping - сработали методы родительского класса
        Dog dog = new Dog();
        animal.eat(); // I am eating - сработал метод родительского класса
        animal.sleep("Animal"); // Animal sleeping - сработал метод родительского класса
        dog.eat(); // Dog is eating - сработал метод класса Dog
        dog.sleep("Dog"); //Dog sleeping - сработал метод родительского класса
        dog.bark(); //Dog bark - сработал метод класса Dog
        dog.showName(); //NAME - сработал метод класса Dog

    }
}
