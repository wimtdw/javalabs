package lab4.num4;

public class Monitor {
    private String model;
    private double screenSizeInches;
    private String resolution;

    public Monitor(String model, double screenSizeInches, String resolution) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Monitor: " + model + ", Screen Size: " + screenSizeInches + " inches, Resolution: " + resolution;
    }
}

