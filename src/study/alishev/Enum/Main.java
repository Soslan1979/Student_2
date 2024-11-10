package study.alishev.Enum;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal);

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case FROG:
                System.out.println("Frog");
                break;
        }

        Season season = Season.SUMMER;
        System.out.println("Средняя температура " + season.getTemperature() + " градусов");

        switch (season) {
            case SUMMER:
                System.out.println("Summer");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case SPRING:
                System.out.println("Spring");
                break;
        }
    }
}
