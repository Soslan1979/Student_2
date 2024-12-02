package study.alishev2.JavaCollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Queue - очередь, принцип FIFO (first-in-first-out) - первый зашел, первый вышел
 *
 *                             Методы
 *          Throws exception            Returns special value
 *    add(e), remove(), element()      offer(e), poll(), peek()
 * */
public class QueueLesson {
    public static void main(String[] args) {

        Person3 person1 = new Person3(1);
        Person3 person2 = new Person3(2);
        Person3 person3 = new Person3(3);
        Person3 person4 = new Person3(4);
        Person3 person5 = new Person3(5);

        //Queue<Person3> people = new LinkedList<>();
        Queue<Person3> people = new ArrayBlockingQueue<Person3>(10); // задает размер очереди
        people.add(person4);
        people.add(person1);
        people.add(person5);
        people.add(person2);
        people.add(person3);

        people.remove(); // удалит элемент первый в очереди, в данном случае person4
        people.peek(); // посмотреть первого в очереди не удаляя его


        for (Person3 person: people){
            System.out.println(person);

        }

    }
}

class Person3 {
    private int id;

    public Person3(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                '}';
    }
}