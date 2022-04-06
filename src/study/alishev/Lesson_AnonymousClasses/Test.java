package study.alishev.Lesson_AnonymousClasses;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal() { // Анонимный класс с переопределенным методом eat
            public void eat() {         // (создается наследник класса Animal, а не объект класса Animal)
                System.out.println("OtherAnimal is eating"); // можем использовать только один раз
            }
        };
        animal1.eat();
    }
}
