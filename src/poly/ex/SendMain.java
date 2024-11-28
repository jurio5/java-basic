package poly.ex;

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = { new EmailSender(), new FaceBookfSender(), new SmsSender() };

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
