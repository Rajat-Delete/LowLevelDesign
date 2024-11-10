package SolidPrinciples.InterfaceSegmentedPrinciple.ProblemStatement;

public class Waiter implements RestaurantEmployee{
    @Override
    public void takeOrder() {
        System.out.println("Order has been taken");
    }

    @Override
    public void serveOrder() {
        System.out.println("Order has been server on the table");
    }

    @Override
    public void cookOrder() {
        //well this work is not mine
        //so instead of that, class has to implement the method
    }
}
