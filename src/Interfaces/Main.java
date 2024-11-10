package Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(101011);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        person.showInfo();
        animal.showInfo();
        Info animalInfo = new Animal(101010); // т.к Animal имплементирет интерфейс Info
        Info personInfo = new Person("Nick");
        animalInfo.showInfo();
        personInfo.showInfo();
    }
}
