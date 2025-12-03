package Thegym;

public class BMI {
    private double height;
    private double weight;

    public BMI (double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public boolean isUnderWeight() {
        return calculateBMI() <= 18.5;
    }

    public boolean isOverWeight() {
        return calculateBMI() >= 25;
    }

    public boolean isNormalWeight() {
        return calculateBMI() > 18.5 && calculateBMI() < 25;
    }

    @Override
    public String toString() {
        return height + " " + weight;
    }
}
