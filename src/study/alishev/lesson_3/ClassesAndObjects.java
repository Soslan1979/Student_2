package study.alishev.lesson_3;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person("Tom", 21); // Создаем объект класса
        Person person2 = new Person("Jack", 32);
        Person person3 = new Person("Nick"); // Создаем объект класса (по "схеме" второго конструктора)
        person.printPerson(); // Вызываем метод printPerson()
        person2.printPerson();
        person.sayHello("Tom"); // Вызываем метод sayHello()
        person2.sayHello("Jack");
        System.out.println(person.calcYearsToRetirement()); // Вызываем метод calcYearsToRetirement()
    }
}

class Person { // Класс
    private String name; //Поля класса
    private int Age;

    Person(String name, int Age) { // Конструктор (как все методы, может быть "перегруженным")
        this.name = name;
        this.Age = Age;
    }

    Person(String name) { // Еще один конструктор
        this.name = name;
    }

    public String getName() { // Метод доступа к полям
        return name;
    }

    public int getAge() {
        return Age;
    }

    void printPerson() { // Метод вывода данных класса
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old.");
    }

    void sayHello(String person) { // Еще один метод c параметром person (не зависит от полей (person внутр. переменная метода))
        System.out.println(person + " say Hello!");
    }

    int calcYearsToRetirement() { // возвращаемый метод (в метод main)
       int years = 65 - Age;
       return years;
    }
}