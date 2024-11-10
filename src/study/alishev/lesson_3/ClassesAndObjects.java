package study.alishev.lesson_3;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person("Tom", 21, 75); // Создаем объект класса
        Person person2 = new Person("Jack", 32); // Создаем объект класса (по "схеме" второго конструктора)
        Person person3 = new Person("Nick"); // Создаем объект класса (по "схеме" третьего конструктора)
        person.printPerson(); // Вызываем метод printPerson()
        person2.printPerson();
        person3.printPerson();
        person.sayHello("Tom"); // Вызываем метод sayHello()
        person2.sayHello("Jack");
        person2.sayHello("Nick");
        System.out.println(person.calcYearsToRetirement()); // Вызываем метод calcYearsToRetirement()
    }
}

class Person { // Класс
    private String name; //Поле класса
    private int Age; //Поле класса
    private int weight;

    Person(String name, int Age, int weight) { // Конструктор (как все методы, может быть "перегруженным")
        this.name = name;
        this.Age = Age;
        this.weight = weight;
    }

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

    public int getWeight() {
        return weight;
    }


    void printPerson() { // Метод вывода данных класса
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old, " + getWeight() + " my weight.");
    }

    void sayHello(String person) { // Еще один метод c параметром person (не зависит от полей (person внутр. переменная метода))
        System.out.println(person + " say Hello!");
    }

    int calcYearsToRetirement() { // возвращаемый метод (в метод main)
       int years = 65 - Age;
       return years;
    }
}