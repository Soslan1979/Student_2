package study.alishev.Lesson_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Example_3 {
    public static void main(String[] args) {
        try {
            readFile(); // при вызове метода так же необходимо реализовать обработку исключения
        } catch (FileNotFoundException e) { // обработка исключений делегируется по иерархии вверх
            //e.printStackTrace();
            System.out.println("File not found!");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
