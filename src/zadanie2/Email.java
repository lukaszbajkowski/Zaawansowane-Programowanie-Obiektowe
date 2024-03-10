package zadanie2;

public class Email implements SendAd {
    @Override
    public void send(String conent, String customer) {
        System.out.println("Reklama została wysłana e-mail: \n" + customer + "\n" + conent + "\n");
    }
}