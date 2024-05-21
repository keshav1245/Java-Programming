package S09_Abstraction.abstraction.abstract_challenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}

public class Store {


    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new ArtObject("Oil Painting", 1350, "Leonardo Da Vince"));
        products.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));
        products.add(new Furniture("Desk", 500, "Mahagony desk"));
        products.add(new Furniture("Lamp", 300, "Lamp with Humming bird"));
//        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);


        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);

    }

    public static void listProducts(){
        for(ProductForSale pd : products){
            System.out.println("-".repeat(30));
            pd.showDetails();
        }
    }


    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order){
            item.product().printPricedLine(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }

}
