import java.io.IOException;

public class OnlineMediaStore {
    public static void main(String[] args) throws IOException {
        Order order = new Order();

        for (int i = 0; i < 5; i++) {
            System.out.println("  Order nr : " + (i + 1));

            order.saveOrder();
            System.out.println(" Saving Done");
            System.out.println(" ");

        }
//        Order.orders.stream().filter(v-> v.getTitle().equals("title"))

    }
}