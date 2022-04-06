package study.alishev.Lesson_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Nick");
        Person person2 = new Person(2, "Jhon");
        Person person3 = new Person(3, "Max");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
