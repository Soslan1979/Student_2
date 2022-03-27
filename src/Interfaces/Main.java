package Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(101011);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        person.showInfo();
        animal.showInfo();
        Info info = new Animal(101010); // т.к Animal имплементирет интерфейс Info
        Info info2 = new Person("Nick");
        info.showInfo();
        info2.showInfo();
    }
}
