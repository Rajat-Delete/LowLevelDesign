package SolidPrinciples.SingleResponsiblity.Solution;

public class Invoice {
    private Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateBill(){
        //calculates the Bill
    }
}