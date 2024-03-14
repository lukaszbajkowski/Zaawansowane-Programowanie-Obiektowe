package zadanie2;

public class Email implements SendAd {
    @Override
    public void send(String content, String recipientInfo) {
        System.out.println("Reklama została wysłana e-mail: \n" + recipientInfo + "\n" + content + "\n");
    }
}