package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요.");
        int orderNum = scanner.nextInt(); scanner.nextLine(); // 버퍼 초기화
        ProductOrder[] productOrders = new ProductOrder[orderNum];
        int count = 0;

        while (orderNum != count) {
            System.out.println(count + 1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String name = scanner.nextLine();

                System.out.print("가격 : ");
                int price = scanner.nextInt();
                System.out.print("수량 : ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

            productOrders[count] = createOrder(name,price,quantity);
            count++;
        }
        printOrder(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + totalAmount);
        scanner.close();
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
