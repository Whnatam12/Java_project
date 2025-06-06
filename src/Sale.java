import java.util.ArrayList;

import java.util.List;

public class Sale {
    private User user;
    private List<Salesitems> itens = new ArrayList<>();

    public Sale(User user) {
        this.user = user;
    }

    public void addItem(Produts produts, int quantity) {
        // if (produts.diminuirEstoque(quantity)) {
        if (produts.removestock(quantity)) {
            itens.add(new Salesitems(produts, quantity));
        } else {
            System.out.println("Estoque insuficiente para o produts: " + produts.getName());
        }
    }

    public double getTotal() {
        double total = 0;
        for (Salesitems item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void showSummary() {
        System.out.println("Venda para: " + user);
        for (Salesitems item : itens) {
            System.out.println("  " + item);
        }
        System.out.println("Total: R$" + getTotal());
        System.out.println();
    }

}
    

