package study.alishev.Lesson_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Example_Try_Catch {
    public static void main(String[] args) {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) { // e объект класса FileNotFoundException
            //e.printStackTrace(); // вызываем у объекта e метод printStackTrace()
            System.out.println("ERROR File not found!"); // Реализуем свой вывод ошибки в замен стандартного
        }

    }
}
