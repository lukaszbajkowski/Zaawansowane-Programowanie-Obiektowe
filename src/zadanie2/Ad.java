package zadanie2;

public class Ad {
    String content;
    Translate translate;
    SendAd send;

    public Ad(String content, Translate translate, SendAd send) {
        this.content = content;
        this.translate = translate;
        this.send = send;
    }

    public void wyslijReklame(AdRecipient odbiorca) {
        String tlumaczonaReklama = translate.translateAd(content, odbiorca.getPreferredLanguage());
        send.send(tlumaczonaReklama, odbiorca.getContactInfo());
    }

    public static void main(String[] args) {
        AdRecipient recipient1 = new AdRecipient("polski", "example@example.com");
        Ad ad1 = new Ad("Promocja 1", new PolishTranslate(), new Email());
        ad1.wyslijReklame(recipient1);

        AdRecipient recipient2 = new AdRecipient("angielski", "123456789");
        Ad ad2 = new Ad("Promocja 2", new EnglishTranslate(), new SMS());
        ad2.wyslijReklame(recipient2);
    }
}
