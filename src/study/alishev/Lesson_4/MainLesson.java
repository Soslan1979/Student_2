package study.alishev.Lesson_4;

public class MainLesson {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        animal.sleep("Animal");
        dog.eat();
        dog.sleep("Dog");
        dog.bark();
        dog.showName();

    }
}
