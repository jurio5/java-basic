package poly.ex;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String send) {
        System.out.println("SMS를 발송합니다 : " + send);
    }
}
