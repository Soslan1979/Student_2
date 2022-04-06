package study.alishev.Lesson_Exception;

import java.util.Scanner;

public class Exception2_Example {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("The user entered a non-zero"); // Описание ошибки
            }
        }
    }
}
