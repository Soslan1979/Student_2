package study.alishev.lesson_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test2");
        PrintWriter printWriter = new PrintWriter("test2"); // Запись только текстовых значений
        printWriter.println("Test row 1");
        printWriter.println("Test row 2");

        printWriter.close();
    }
}
