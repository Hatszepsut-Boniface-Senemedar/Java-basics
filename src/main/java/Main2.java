// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main2 {

    int a =0;
    String marka;
    String kolor;
    String model;
    int iloscDrzwi;
    int pojemnoscSilnika;

    void met(){

    }

    String  met2(){
       return "";
    }

    ///
    // 0 1 -> 0
    // true && true -> true
    // 1 0
    // 0 0 -> false

    public static void main(String[] args) {
        int dzielnik = 0;
        int dzielna = 0;
        double wynik = 0;
        if ((dzielnik > dzielna) && dzielna != 0) {
            wynik = dzielnik / dzielna;
        } else if (dzielna == 0) {
            System.out.println("nie dzielimy przez 0!");

        } else {
            System.out.println("cos poszlo nie tak");
        }

        // obiekty
        Auto mercedes = new Auto();
        Auto auto2 = new Auto();
        // przypisanie wartosci do pola obiektu
        mercedes.iloscDrzwi = 3;
        auto2.kolor = "czerwony";

        // odczytanie wartosci pól obiektow
        System.out.println(mercedes.iloscDrzwi);
        System.out.println(mercedes.kolor);
        System.out.println(auto2.kolor);

        Auto honda = new Auto("Honda");
        System.out.println(honda.marka);

        Auto auto3 = new Auto("BMW", "Szary");

        Auto auto4 = new Auto("Honda", "szary", "Accord", 5, 2200);
        System.out.println(auto4.TellSomething());
        System.out.println(mercedes.TellSomething());

        Figury kwadrat = new Figury();

        kwadrat.setBok(-5);
        System.out.println(kwadrat.obliczPoleKwadratu(7));

        Auto honda2 = new Auto();
        honda2.marka ="Honda";

        kwadrat.obliczPoleKwadratu(6);

        System.out.println(kwadrat.obliczPoleProstokata(8,9));
    }

    public String TellSomething() {
        String text = "Jestem " + marka + " mam kolor " + kolor + " model " + model + " ilość drzwi " + iloscDrzwi + " i " + pojemnoscSilnika + " cm2";
        return text;
    }



//trojkat.obliczPoleTrojkata(4,7);
//        System.out.println(trojkat.obliczPoleTrojkata(7,9));
//    }
}










