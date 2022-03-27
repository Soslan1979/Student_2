package study.alishev.lesson_3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] number = new int[5]; // массив размером-5; [0, 0, 0, 0, 0]
                                   // индекс массива:    [0, 1, 2, 3, 4]
        int[] num = {1, 2, 3};     // инициализируем массив и заполняем значениями
        number[0] = 10; // внесли в массив значение 10 по индексу 0
                                   // массив размером-5; [10, 0, 0, 0, 0]
                                   // индекс массива:    [0, 1, 2, 3, 4]

        System.out.println(number[0]);

        int[] number2 = new int[5];
        for (int i = 0; i < number2.length; i++ ) {  // цикл, number2.length (.length определяет размер массива)
            number2[i] = i * 10; // заполняем массив значениями
        }
        for (int i = 0; i < number2.length; i++ ){
            System.out.println(number2[i]); // выводим по индексу в цикле
        }
        System.out.println(number2); // [I@1b28cdfa
        System.out.println(Arrays.toString(number2)); // [0, 10, 20, 30, 40] / Arrays.toString спец. метод для вывода массива
    }
}
