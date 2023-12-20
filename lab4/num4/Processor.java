package lab4.num4;

public class Processor {
    private String model;
    private double clockSpeedGHz;
    private int numberOfCores;

    public Processor(String model, double clockSpeedGHz, int numberOfCores) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
        this.numberOfCores = numberOfCores;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    @Override
    public String toString() {
        return "Processor: " + model + ", Clock Speed: " + clockSpeedGHz + " GHz, Cores: " + numberOfCores;
    }
}

