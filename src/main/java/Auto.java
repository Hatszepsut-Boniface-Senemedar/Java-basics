public class Auto {
    //pola klasy
    //tylko jedna klase moge tu na gitthub zmienic bo reszta ciezko tertr
    String marka;
    String kolor;
    String model;
    int iloscDrzwi;
    int pojemnoscSilnika;

    public Auto() {
        for(int i=0; i < 20; i++){
            System.out.println("abcdefg");

        }
    }

    public Auto(String kolor) {
        this.kolor = kolor;
    }

    public Auto(String marka, String kolor) {
        this.marka = marka;
        this.kolor = kolor;

    }

    public Auto(String marka, String kolor, String model, int iloscDrzwi, int pojemnoscSilnika) {
        this.marka = marka;
        this.kolor = kolor;
        this.model = model;
        this.iloscDrzwi = iloscDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String TellSomething() {
        String text = "Jestem" + marka + "mam kolor" + kolor + "model" + model + "ilośc drzwi" + iloscDrzwi + pojemnoscSilnika
                + "cm2";
        return text;
    }
}
