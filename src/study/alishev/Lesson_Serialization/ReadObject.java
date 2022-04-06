package study.alishev.Lesson_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            Person person3 = (Person) objectInputStream.readObject();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
