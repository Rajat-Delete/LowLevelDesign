package SolidPrinciples.LiskovSubsitutionPrinciple.ProblemStatement;

public class Bicycle implements TwoWheeler{
    int speed;

    boolean isEngineOn;
    @Override
    public void increaseSpeed() {
        speed = speed+10;
    }

    @Override
    public void turnOnEnginer() {
        throw new AssertionError("No Engine exists for the Bicycle");
    }
}
