package study.alishev.lesson_1;

public class Main {
    public static void main(String[] args) {
        printer("Soslan");
        printColor(150);
        compareNumbers(5, 10);
    }

    public static void printer(String name){
        System.out.println("Your name is " + name);
    }

    public static void printColor(int a) {
        if (a <= 0)
            System.out.println("red");
        if (a > 0 && a <= 100)
            System.out.println("yellow");
        else
            System.out.println("green");

    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a > b? "a more b" : "a less b");
    }
}
