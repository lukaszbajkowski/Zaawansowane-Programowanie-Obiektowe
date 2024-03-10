package zadanie2;

public class VoiceMessage implements SendAd{
    @Override
    public void send(String content, String customer) {
        System.out.println("Reklama została wysłana na numer: \n" + customer + "\n" + content + "\n");
    }
}