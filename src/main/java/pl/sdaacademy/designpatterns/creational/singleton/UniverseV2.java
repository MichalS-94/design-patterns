package pl.sdaacademy.designpatterns.creational.singleton;

public class UniverseV2 {
    private static UniverseV2 instance = new UniverseV2();

    private double mass;
    private double avgTemperature;


    public static UniverseV2 getInstance() {
        return instance;
    }

    private UniverseV2() {}

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
}
