package zadanie6;

public class Pracownik implements Dojezdzac, SpedzanieWolnegoCzasu, Pracowac {
    private String zawod;
    private final Dojezdzac dojezdzac;
    private final SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private final Pracowac pracowac;

    public Pracownik(String zawod, Dojezdzac dojezdzac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Pracowac pracowac) {
        this.zawod = zawod;
        this.dojezdzac = dojezdzac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.pracowac = pracowac;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public String getZawod() {
        return zawod;
    }

    @Override
    public void dojezdzaj() {
        dojezdzac.dojezdzaj();
    }

    @Override
    public void spedzajWolnyCzas() {
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    @Override
    public void pracuj() {
        pracowac.pracuj();
    }
}
