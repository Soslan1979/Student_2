package study.alishev.Enum;

public enum Season {
    SUMMER(30), WINTER(-25), AUTUMN(10), SPRING(15);
    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
