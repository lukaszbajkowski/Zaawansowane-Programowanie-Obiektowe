package zadanie6;

public class Pracownik {
    String zawod;
    Dojezdzac dojezdzac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    Pracowac pracowac;

    public Pracownik(String zawod, Dojezdzac dojezdzac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Pracowac pracowac) {
        this.zawod = zawod;
        this.dojezdzac = dojezdzac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.pracowac = pracowac;
    }

    public String getZawod() {
        return zawod;
    }

    public void dojezdzaj() {
        dojezdzac.dojezdzaj();
    }

    public void spedzajWolnyCzas() {
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    public void pracuj() {
        pracowac.pracuj();
    }
}
