package study.alishev.lesson_2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } //while (value != 5);
        while (value !=0);
        System.out.println("Вы ввели 5");
        System.out.println("Вы ввели 0, выход из программы");
    }
}
