package zadanie2;

public class VoiceMessage implements SendAd{
    @Override
    public void send(String content, String recipientInfo) {
        System.out.println("Reklama została wysłana na numer: \n" + recipientInfo + "\n" + content + "\n");
    }
}