package SolidPrinciples.InterfaceSegmentedPrinciple.Solution;

public class Waiter implements WaiterInterface{
    @Override
    public void takeOrder() {
        System.out.println("Order has been taken");
    }

    @Override
    public void serveOrder() {
        System.out.println("Order has been server on the table");
    }
}
