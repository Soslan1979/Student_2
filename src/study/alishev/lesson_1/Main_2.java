package study.alishev.lesson_1;

public class Main_2 {
    public static void main(String[] args) {
        printer("Soslan");
        calc(5,10);
        passwordVerification("Qwerty$4");
    }

    public static void printer(String name){
        System.out.println("Your name is " + name);
    }

    public static void calc(int a, int b) {
        System.out.println(a + b);
    }

    public static void passwordVerification(String password) {
        System.out.println(password.equals("Qwerty$4")? "ok":"no");
    }

}
