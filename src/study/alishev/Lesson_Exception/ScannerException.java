package study.alishev.Lesson_Exception;

public class ScannerException extends Exception { // Создали свой класс исключения
    public ScannerException(String description) {
        super(description);
    }
}
