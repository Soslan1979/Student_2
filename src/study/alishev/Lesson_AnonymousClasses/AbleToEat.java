package study.alishev.Lesson_AnonymousClasses;
//Пример анонимного класса через интерфейс
interface AbleToEat {
    public void eat();
}

class OtherTest {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() { // Создали анонимный класс реализующий методы интерфейса AbleToEat
            @Override                           // в котором мы переопределяем метод eat
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}