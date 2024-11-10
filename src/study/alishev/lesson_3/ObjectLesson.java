package study.alishev.lesson_3;

public class ObjectLesson {
    public static void main(String[] args) {
        Human human = new Human("Bob", 41);
        Human human2 = new Human("Tom", 45);
        System.out.println(human);
        String agePrint = "Возраст: ";
        System.out.println(agePrint + human.getAge());
        System.out.println(human2);
        System.out.println(agePrint + human2.getAge());
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {  // Переопределили метод toString (метод toString унаследованный от родительского класса Object) в String
        return "Name: " + name + ", Age: " + age; // шаблон, как хотим видеть вывод
    }

}
