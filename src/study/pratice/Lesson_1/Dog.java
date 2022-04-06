package study.pratice.Lesson_1;

public class Dog extends Animal {

    public Dog(String name, String color, int id) {
        super(name, color, id);
    }
    @Override
    public void showInfo() {
        System.out.println(getName() + " say Hello!");
    }
}
