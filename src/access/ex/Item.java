package access.ex;

public class Item {
    private String item;
    private int price;
    private int quantity;

    public Item(String item , int price , int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public int sumTotalPrice() {
        return price * quantity;
    }
}
