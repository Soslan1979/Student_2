package study.alishev.Lesson_AbstractClass;

public class Cat extends Animal{
    @Override
    public void makeSound() { // переопределённый метод абстрактного класса Animal
        System.out.println("meow");
    }
}
