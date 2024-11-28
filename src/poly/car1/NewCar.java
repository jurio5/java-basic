package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAcceleator() {
        System.out.println("NewCar.pressAcceleator");
    }
}
