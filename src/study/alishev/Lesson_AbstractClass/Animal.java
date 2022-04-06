package study.alishev.Lesson_AbstractClass;

public abstract class Animal { // abstract указывает, что класс абстрактный (концепция), его объекты не могут быть созданны
    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void makeSound(); // абстрактный метод, не имеет реализации, создается только в абстрактных классах
}
