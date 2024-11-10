package study.alishev.Lesson_Serialization3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] person = {new Person(1, "Nick"),
                           new Person(2, "Jhon"),
                           new Person(3, "Max")};

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
