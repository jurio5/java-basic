package poly.ex.pay0;

public abstract class PayStore {

    // 변하는 부분
    public static Pay findPay(String option) {
        switch (option) {
            case "kakao":
                return new KakaoPay();
            case "naver":
                return new NaverPay();
            default:
                return new DefaultPay();
        }
    }
}
