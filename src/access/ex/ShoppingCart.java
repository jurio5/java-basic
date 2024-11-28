package access.ex;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        if (items.size() >= 10) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
        items.add(item);
    }

    public void printItem() {
        System.out.println(" == 장바구니 상품 출력 ==");

        for (Item item : items) {
            System.out.println("상품명 : %s, 합계 : %d ".formatted(item.getItem(),item.sumTotalPrice()));
        }

        System.out.println("총 상품 금액 : %d ".formatted(totalPrice()));
    }

    private int totalPrice() {
        int price = 0;

        for (Item item : items) {
            price += item.sumTotalPrice();
        }
        return price;
    }

}
