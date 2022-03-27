package study.alishev.lesson_3;

public class Builder {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Hello");
        string.append(" my").append(" friend!");
        System.out.println(string);
        string.replace(1, 2, "i");
        string.deleteCharAt(2); // удалить символ в изменяемой строке
        String result = string.toString(); // преобразовать объект StringBuilder к строке типа String



    }
}
