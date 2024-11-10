package SolidPrinciples.LiskovSubsitutionPrinciple.ProblemStatement;

public class Bike implements TwoWheeler{
    int speed;
    boolean isEngineOn;

    @Override
    public void increaseSpeed() {
        speed = speed + 10;
    }

    @Override
    public void turnOnEnginer() {
        isEngineOn = true;
    }
}
