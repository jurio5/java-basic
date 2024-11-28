package poly.ex.pay0;

public class DefaultPay implements Pay { // Null object pattern
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 존재하지 않습니다.");
        return false;
    }
}
