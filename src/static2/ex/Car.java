package static2.ex;

public class Car {
    private static int buyCount;
    private String carName;

    public Car(String carname) {
        this.carName = carname;
        Car.buyCount++;
        System.out.println("차량 구입, 이름 : " + carname);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + buyCount);
    }

}
