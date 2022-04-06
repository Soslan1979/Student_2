package study.pratice.Lesson_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "black", 01);
        Animal animal = new Animal("Mouse", "grey", 02);
        animal.showInfo();
        dog.showInfo();
        dog.test();
        dog.test2();
    }
}
