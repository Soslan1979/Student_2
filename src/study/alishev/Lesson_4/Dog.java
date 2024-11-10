package study.alishev.Lesson_4;

public class Dog extends Animal { // Унаследованный класс от класса Animal
    public void eat() {           // Переопределенный метод родительского класса Animal
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog bark"); // Метод класса Dog
    }

    public void showName() {
        System.out.println(name);
    }

}
