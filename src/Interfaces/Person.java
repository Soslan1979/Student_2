package Interfaces;

public class Person implements Info { // унаследуем интерфейс Info (можно несколько)
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() { // метод унаследован от интерфейса Info
        System.out.println(name);
    }
}
