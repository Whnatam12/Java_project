public class Produts {
    private String name;
    private double price;
    private int quantitystock;

    public Produts(String name, double price, int quantitystock) {
        this.name = name;
        this.price = price;
        this.quantitystock = quantitystock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getquantityStock() {
        return quantitystock;
    }

    public boolean removestock(int quantidade) {
        if (quantidade <= quantitystock) {
            quantitystock -= quantidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " - R$" + price + " (Estoque: " + quantitystock + ")";
    }
}
