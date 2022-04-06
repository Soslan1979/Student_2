package study.alishev.Lesson_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Example_throws {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");

        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }
}
