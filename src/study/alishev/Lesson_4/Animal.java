package study.alishev.Lesson_4;

public class Animal { // Родительский класс

    String name = "NAME";

    public void eat() {
        System.out.println("I am eating"); // Метод родительского класса
    }


    public void sleep(String name) { // Метод родительского класса с параметром (String name)
        System.out.println(name + " sleeping");
    }
}
