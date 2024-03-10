package zadanie2;

public class Ad {
    String content;
    String language;
    Translate translate;
    SendAd send;

    public Ad(String content, String language, Translate translate, SendAd send) {
        this.content = content;
        this.language = language;
        this.translate = translate;
        this.send = send;
    }

    public void wyslijReklame(String odbiorca) {
        String tlumaczonaReklama = translate.translateAd(content, language);
        send.send(tlumaczonaReklama, odbiorca);
    }

    public static void main(String[] args) {
        Ad ad1 = new Ad("Promocja 1", "polski", new PolishTranslate(), new Email());
        ad1.wyslijReklame("example@example.com");

        Ad ad2 = new Ad("Promocja 2", "angielski", new EnglishTranslate(), new VoiceMessage());
        ad2.wyslijReklame("123456789");
    }
}