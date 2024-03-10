package zadanie2;

public class EnglishTranslate implements Translate {
    @Override
    public String translateAd(String content, String language) {
        return content + " (tłumaczenie na język angielski)";
    }
}