package study.alishev.Lesson_Serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] person = {new Person(1, "Nick"),
                           new Person(2, "Jhon"),
                           new Person(3, "Max")};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
