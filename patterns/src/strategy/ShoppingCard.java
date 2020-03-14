package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Item> items;

    public ShoppingCard() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    private int totalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int totalPrice = totalPrice();
        paymentStrategy.pay(totalPrice);
    }

}
