package study.alishev.lesson_3;

import java.util.Arrays;

public class ArrOfStrings {
    public static void main(String[] args) {
        String[] strings = new String[3];
        String[] strings2 = {"one", "two", "three"};
        strings[0] = "Hello";
        strings[1] = "world";
        strings[2] = "WOW!";
        System.out.println(Arrays.toString(strings));
        for(String string:strings) {  // for each String-тип данных / string-имя переменной / strings-имя массива
            System.out.println(string);
        }
        for(String string:strings2) {  // for each String-тип данных / string-имя переменной / strings-имя массива
            System.out.println(string);
        }
    }
}
