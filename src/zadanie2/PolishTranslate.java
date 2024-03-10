package zadanie2;

public class PolishTranslate implements Translate {
    @Override
    public String translateAd(String content, String language) {
        return content + " (tłumaczenie na język polski)";
    }
}