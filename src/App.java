import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    
        List<User> users = new ArrayList<>();
        List<Produts>produts = new ArrayList<>();
        List<Sale>sales = new ArrayList<>();

     
        User u1 = new User("Maria", "303.456.789-40", "maria@gmail.com");
        User u2 = new User("João", "407.654.321-11", "joao@gmail.com");
        User u3 = new User("Carlos", "507.704.352-20", "carlos@gmail.com");
        users.add(u1);
        users.add(u2);
        users.add(u3);


        Produts p1 = new Produts("Iphone 11", 5000.00, 5);
        Produts p2 = new Produts("Monitor gamer", 700.00, 10);
        Produts p3 = new Produts("Webcam", 150.00, 8);
      
     
       produts.add(p1);
       produts.add(p2);
       produts.add(p3);

   
        Sale v1 = new Sale(u1);
        v1.addItem(p1, 3);
        v1.addItem(p2, 1);

        Sale v2 = new Sale(u2);
        v2.addItem(p2, 3);
        v2.addItem(p3, 1);
        v2.addItem(p1, 5);



        Sale v3 = new Sale(u3);
        v3.addItem(p2, 3);
      


       sales.add(v1);
       sales.add(v2);
       sales.add(v3);

      
        System.out.println("=== Resumo das vendas ===");
        for (Sale sale : sales) {
            sale.showSummary();
        }

   
        System.out.println("===Produto em Estoque ===");
        for (Produts produto : produts) {
            System.out.println(produto);
        }
    }
}
