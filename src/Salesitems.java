public class Salesitems {
    private Produts produts;
    private int quantity;

    public Salesitems(Produts produts, int quantity) {
        this.produts = produts;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return produts.getPrice() * quantity;
    }

    public Produts getProduts() {
        return produts;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return produts.getName() + " x" + quantity + " = R$" + getSubtotal();
    }
}
