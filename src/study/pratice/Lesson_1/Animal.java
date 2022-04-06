package study.pratice.Lesson_1;

public class Animal implements Methods {
    private String name;
    public String color;
    private int id;

    public Animal(String name, String color, int id) {
        this.name = name;
        this.color = color;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println(name + " say Hi!");
    }


    @Override
    public void test() {
        System.out.println("I am method test");
    }

    @Override
    public void test2() {
        System.out.println("I am method test2");
    }
}

