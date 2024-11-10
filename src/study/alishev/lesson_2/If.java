package study.alishev.lesson_2;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int ID = scanner.nextInt();
        if(ID < 10){
            System.out.println("less 10");
        } else if (ID == 10) {
            System.out.println("10");
        } else {
            System.out.println("more 10");
        }
    }
}
