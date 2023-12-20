package lab4.num1;


enum Season {
    Весна(15.0, "Теплое время года"),
    Лето(25.0, "Жаркое время года"),
    Осень(15.0, "Прохладное время года"),
    Зима(-5.0, "Холодное время года");

    private final double averageTemperature;
    private final String description;

    Season(double averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }
}

