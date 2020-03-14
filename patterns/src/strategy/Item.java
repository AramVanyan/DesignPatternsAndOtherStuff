package strategy;

public class Item {
    private int price;
    private String itemCode;

    public Item(int price, String itemCode) {
        this.price = price;
        this.itemCode = itemCode;
    }

    public int getPrice() {
        return price;
    }

    public String getItemCode() {
        return itemCode;
    }
}
