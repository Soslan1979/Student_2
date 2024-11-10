package study.alishev.lesson_2;

public class While_2 {
    public static void main(String[] args) {
        int value = 0;
        while (value < 5){
            System.out.println("Итерация цикла " + value);
            value++; // идентично: value = value + 1 или value += 1
        }
        System.out.println("Конец цикла");

    }
}
