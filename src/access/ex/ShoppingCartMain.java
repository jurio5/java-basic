package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("상추" , 2000 , 3);
        Item item2 = new Item("배추" , 4000 , 6);

        shoppingCart.add(item1);
        shoppingCart.add(item2);

        shoppingCart.printItem();
    }
}
