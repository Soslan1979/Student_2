package study.alishev.lesson_2;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int id = scanner.nextInt();
        if(id < 10){
            System.out.println("Число меньше десяти!");
        } else if (id == 10) {
            System.out.println("Число равно десяти!");
        } else System.out.println("Число больше десяти!");
    }
}
