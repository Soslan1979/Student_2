package study.alishev.Lesson_AbstractClass;

public class Dog extends Animal{
    @Override
    public void makeSound() { // переопределённый метод абстрактного класса Animal
        System.out.println("bark");
    }
}
