package S14_Concurrency_Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

record Order(long orderId, String item, int qty){

}

class WareHouse {
    private List<Order> shippingItems;
    public final static String[] PRODUCT_LIST = {"Running Shoes",
    "Sandals", "Boots", "Slippers", "High Tops"};

    public WareHouse(){
        this.shippingItems = new ArrayList<>();
    }

    public synchronized void receiveOrders(Order item){

        while (shippingItems.size() > 20){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        shippingItems.add(item);
        System.out.println("Incoming Item : " + item);
        notifyAll();

    }

    public synchronized Order fulfillOrders(){

        while (shippingItems.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Order item = shippingItems.remove(0);
        System.out.println(Thread.currentThread().getName() + " Order Fulfilled : " + item);
        notifyAll();
        return item;

    }


}

public class ShoeWareHouse {

    private static final Random random = new Random();
    public static void main(String[] args) {

        WareHouse wareHouse = new WareHouse();
        Thread producer = new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                wareHouse.receiveOrders(new Order(
                        random.nextLong(100000, 9999999),
                        WareHouse.PRODUCT_LIST[random.nextInt(0, WareHouse.PRODUCT_LIST.length)],
                        random.nextInt(1 , 4)
                ));
            }
            
        });
        producer.start();

        for (int i = 0; i < 2; i++) {
            Thread consumerThread = new Thread(() -> {
                for (int j = 0; j < 500; j++) {
                    Order item = wareHouse.fulfillOrders();
                }
            });

            consumerThread.start();
        }

    }
}
