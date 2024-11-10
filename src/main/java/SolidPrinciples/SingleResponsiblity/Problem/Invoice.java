package SolidPrinciples.SingleResponsiblity.Problem;

public class Invoice {
    private Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void printBill(){
        //do something
    }

    public void saveData(){
        //save data to File
    }

    public void calculateBill(){
        //calculates the Bill
    }
}
