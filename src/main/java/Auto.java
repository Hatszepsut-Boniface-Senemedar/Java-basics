public class Auto {
    //pola klasy
    String marka;
    String kolor;
    String model;
    int iloscDrzwi;
    int pojemnoscSilnika;

    public Auto() {


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
