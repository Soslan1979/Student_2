package study.alishev.lesson_2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Вы ввели " + num);
                break;
            case 2:
                System.out.println("Вы ввели " + num);
                break;
            case 3:
                System.out.println("Вы ввели " + num);
                break;
        }
    }
}

// switch (num){
//         case 1:
//         case 2:
//         case 3:
//         System.out.println("Вы ввели " + num);
//         break;