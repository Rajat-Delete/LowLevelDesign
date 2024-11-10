package SolidPrinciples.OpenClosedPrinciple.Solution;

public class DatabaseInvoice implements InvoiceDao {
    String item;
    int Quanity;

    public DatabaseInvoice(int quanity, String item) {
        Quanity = quanity;
        this.item = item;
    }

    @Override
    public void save(Invoice invoice) {

    }

    //new method need to be added in Live File.
    //So instead of adding we will implement from new Interface.
}