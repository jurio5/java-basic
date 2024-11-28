package poly.ex;

public class FaceBookfSender implements Sender {
    @Override
    public void sendMessage(String send) {
        System.out.println("페이스북에 발송합니다 : " + send);
    }
}
