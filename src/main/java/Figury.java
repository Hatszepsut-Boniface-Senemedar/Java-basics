public class Figury {

    private int bok;
    private int podstawa;
    private int wysokosc;
    private int promien;

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }

    public int getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }



    public int obliczPoleKwadratu(int bok) {
        int pole = bok * bok;
        return pole;
    }

    public int obliczPoleProstokata(int bok, int wysokosc) {
        int pole = bok * wysokosc;
        return pole;
    }

    public double obliczPoleTrojkata(double podstawa, double wysokosc){
        return 0.5d * wysokosc * podstawa;
    }
}


