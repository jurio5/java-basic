package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {

            ProductOrder productOrder1 = createOrder("두부", 2000, 2);
            ProductOrder productOrder2 = createOrder("김치", 5000, 1);
            ProductOrder productOrder3 = createOrder("콜라", 1500, 2);


        ProductOrder[] productOrders = {productOrder1,productOrder2,productOrder3};

        printOrder(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    public static ProductOrder createOrder(String productName , int price , int quantity) {
        ProductOrder productOrder = new ProductOrder();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    public static int getTotalAmount(ProductOrder[] totalprice) {
        int totalpay = 0;
        for (ProductOrder order : totalprice) {
            totalpay += order.price * order.quantity;
        }

        return totalpay;
    }

    public static void printOrder(ProductOrder[] orders) {

        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

}
