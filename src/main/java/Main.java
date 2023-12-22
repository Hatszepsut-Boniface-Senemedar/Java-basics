import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }

    // prezentacja zmiennych
    /*
        String name = "Pawel";
    int age = 29;
    char gender = 'k';
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
       */

    //operacje na stringach
        /*
        //  String courseName = "Podstawy programowania";
        //
        // System.out.println(courseName.length());
        //  System.out.println(courseName.isEmpty());
        //  System.out.println(courseName.toUpperCase());
        //  System.out.println(courseName.toUpperCase());
        //  System.out.println(courseName.contains("programowania"));
        //
        //  System.out.println(courseName.indexOf ("o"));
        //  System.out.println(courseName.lastIndexOf("o"));
        //  System.out.println(courseName.substring(2,4));
        //  System.out.println(courseName.equals("test"));
        //  System.out.println(courseName.replace( "o",  "x"));
        */

//        int dzielnik;
//        int dzielna;

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzielnik");
        dzielnik = scanner.nextInt();
        System.out.println("Podaj dzielną");
       dzielna = scanner.nextInt();
//double wynik;

        double wynik = 0;
if((dzielnik>dzielna) && dzielna !=0)
    { wynik = dzielnik / dzielna;
    }
      else if (dzielna==0)
      {
    System.out.println("nie dzielimy przez 0!");

    } else  {
    System.out.println("cos poszlo nie tak");
}/*
        System.out.println(wynik);
      */


    //switch
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj numer dnia tygodnia");
        int numerDniaTygodnia = scanner1.nextInt();

        switch(numerDniaTygodnia) {
            case 0:
                System.out.println("cos nie jest tak");
                break;
            case 6:
                System.out.println("sobota!");
                break;
            case 7:
                System.out.println("jutro do pracy");
                break;
            case 5:
                System.out.println("piatunio");
                break;
            default:
                System.out.println("musze isc do pracy");

         */
    //zakres widocznosi
        /* int cyfra1 = 5;
        if (cyfra1!=0){
            int cyfra2 =10;
            System.out.println(cyfra1);
            System.out.println(cyfra2);
        }
        System.out.println(cyfra);
        System.out.println(cyfra2);
         */
    //petla for
/*
        for (int i = 0; i <= 10; i++) {
            System.out.println("obecna wartośc i to: " + i);

            }
            String name = "Konstantyn";

            for (int i = 0; i<name.length(); i++) {

                System.out.println(name.substring(i, i + 1));
            }
            */

       /* String name1 = "Konstantyn";
        for (int i = 0; i < name1.length(); i++) {
            String znak = name1.substring(i, i + 1);
            if (znak.equals("o")) {
                continue;
            }
            if (znak.equals("y")) {
                break;
            }
            System.out.println(znak);
        }

        int x = -5;

        do {
            System.out.println("wszedlem do petli");
            x++;
            System.out.println("aktualna wartosc x to: " + x);

        } while (x < 0);
        while (x < 0) {
            System.out.println("wszedlem do petli");
            x++;
            System.out.println("aktualna wartosc x to: " + x);

        }

        // próbne
        /*
        String Name = "konrad gajewski";



        System.out.println(name nazwisko);
        System.out.println(courseName.toUpperCase());

        System.out.println(courseName.replace( "k",  "x"));

*/

       /* String name = "konrad";
        String vorname = "Gajew";

        System.out.println(name+vorname);
        System.out.println(name.toUpperCase());
        System.out.println(vorname.toUpperCase());

        System.out.println(name.replace( "k",  "x"));
        System.out.println(vorname.replace( "j",  "x"));
        */


    //tablice

        /*
        int[] mojaTablica = new int[5];
        mojaTablica[0] = 1;
        mojaTablica[1] = 2;
        mojaTablica[2] = 3;
        mojaTablica[3] = 4;
        mojaTablica[4] = 5;

        for (int x : mojaTablica) {
            System.out.println(x);
        }

        mojaTablica[3] = 6;
        mojaTablica[4] = 7;

        System.out.println("PAUZA");
        for (int x : mojaTablica) {
            System.out.println(x);
        }
        System.out.println("PAUZA");
        System.out.println(mojaTablica[2]);
        System.out.println("PAUZA");

        int[][] mojaDwuwymiarowaTablica = new int[5][5];
        mojaDwuwymiarowaTablica[1][1] = 1;
        System.out.println(mojaDwuwymiarowaTablica[1][1]);
        mojaDwuwymiarowaTablica[0][0] = 10000;
        System.out.println(mojaDwuwymiarowaTablica[0][0]);
        mojaDwuwymiarowaTablica[0][4] = 100;
        System.out.println(mojaDwuwymiarowaTablica[0][4])
         */

      /*  int[] mojaTablica = new int[5];
        mojaTablica[0] = 1;
        mojaTablica[1] = 2;
        mojaTablica[2] = 3;
       /* mojaTablica[3] = 4;
        mojaTablica[4] = 5;

        for (int x : mojaTablica) {
            System.out.println(x);
        }
        mojaTablica[3] = 4;
        mojaTablica[4] = 5;
        System.out.println("Pauza");
        for (int x : mojaTablica) {
            System.out.println(x);
        }
        System.out.println("Pauza");
        System.out.println(mojaTablica[2]);

        int[][] mojaDwuwymiarowaTablica = new int[5][5];
        mojaDwuwymiarowaTablica[1][1] = 1;
        System.out.println(mojaDwuwymiarowaTablica[1][1]);
        mojaDwuwymiarowaTablica[0][0] = 10000;
        System.out.println(mojaDwuwymiarowaTablica[0][0]);
        */




       /* Scanner scanner = new Scanner(System.in);
        int liczba;
        int dzielnik1;
        System.out.println("Podaj liczbę pierwszą");
        liczba = scanner.nextInt();

        System.out.println("Podaj dzielnik");
        dzielnik1 = scanner.nextInt();

        //double wynik;

        if (dzielnik != [1,2,3,5,7]){
            System.out.println("nie jest to liczba pierwsza");
        }

        */
        /*System.out.println("Podaj liczbę wariacie");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        if(liczba==1){
            System.out.println("Nie możemy używać 1");
        } else if ((liczba%2 == 0) && (liczba != 2)){
            System.out.println(liczba + " nie jest liczbą pierwszą");
        } else if (liczba%3 == 0 && (liczba != 3)){
            System.out.println(liczba + " nie jest liczbą pierwszą");
        } else if (liczba%5 == 0 && (liczba != 5)){
            System.out.println(liczba + " nie jest liczbą pierwszą");
        } else if (liczba%7 == 0 && (liczba != 7)){
            System.out.println(liczba + " nie jest liczbą pierwszą");
        } else {
            System.out.println( liczba + " jest liczbą piewszą");
        }
*/
        /*
        System.out.println("Policz pole trojkata");
        Scanner scanner = new Scanner(System.in);
        int podstawa;
        int wysokość;
        double wynik;
        System.out.println("podaj podstawe");
        podstawa = scanner.nextInt();
        System.out.println("podaj wysokosc");

        wysokość = scanner.nextInt();
        wynik = podstawa * wysokość * 0.5;
        System.out.println(wynik);
        System.out.println(" cm2");

        //pole 3kata
        /*System.out.println("Podaj wysokość");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("Podaj długość podstawy");
        int podstawa = scanner.nextInt();
        double pole = 0.5*podstawa*wysokosc;
        System.out.println(pole); */

    //obiekty
        /*
        Auto mercedes = new Auto();

        Auto auto2 = new Auto();
        mercedes.iloscDrzwi = 3;
        auto2.kolor = "czerwony";


        //obiekty

        Auto mercedes = new Auto();
        Auto auto2 = new Auto();
        // przypisanie wartosci do pola obiektu
        mercedes.iloscDrzwi = 3;
        auto2.kolor = "czerwony";



        // odczytanie wartosci pól obiektow

        System.out.println(mercedes.iloscDrzwi);
        System.out.println(mercedes.kolor);
        System.out.println(auto2.kolor);

        //odczytanie obiekt&oacute

        System.out.println(mercedes.iloscDrzwi);
        System.out.println(mercedes.kolor;
        System.out.println(auto2.kolor);

        //konstruktor z parametrami

        Auto honda = new Auto("czerwony");
        System.out.println();
        Auto auto3 = new Auto ("Honda", "niebieski");

        Auto auto4 = new Auto("Honda", "szary", "Accord" );



        Scanner scanner = new Scanner(System.in);
        int liczba;
        int dzielnik1;
        System.out.println("Podaj liczbę pierwszą");
        liczba = scanner.nextInt();

        System.out.println("Podaj dzielnik");
        dzielnik1 = scanner.nextInt();

        //double wynik;

        if (dzielnik != [1,2,3,5,7]){
            System.out.println("nie jest to liczba pierwsza");
        }
    }

        System.out.println("Podaj liczbę wariacie");
    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
        if(liczba==1){
        System.out.println("Nie możemy używać 1");
    } else if ((liczba%2 == 0) && (liczba != 2)){
        System.out.println(liczba + " nie jest liczbą pierwszą");
    } else if (liczba%3 == 0 && (liczba != 3)){
        System.out.println(liczba + " nie jest liczbą pierwszą");
    } else if (liczba%5 == 0 && (liczba != 5)){
        System.out.println(liczba + " nie jest liczbą pierwszą");
    } else if (liczba%7 == 0 && (liczba != 7)){
        System.out.println(liczba + " nie jest liczbą pierwszą");
    } else {
        System.out.println( liczba + " jest liczbą piewszą");
    }


        System.out.println("Podaj wysokość");
    Scanner scanner = new Scanner(System.in);
    int wysokosc = scanner.nextInt();
        System.out.println("Podaj długość podstawy");
    int podstawa = scanner.nextInt();
    double pole = 0.5*podstawa*wysokosc;
        System.out.println(pole);

public class Auto {
    // pola klasy
    String marka;
    String kolor;
    String model;
    int iloscDrzwi;
    int pojemnoscSilnika;

    public Auto() {
    }



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





// konstruktor z parametrami

        Auto honda = new Auto("Honda");
        System.out.println(honda.marka);

        Auto auto3 = new Auto("BMW","Szary");

        Auto auto4 = new Auto("Honda","szary","Accord",5,2200);
        System.out.println(auto4.TellSomething());
        System.out.println(mercedes.TellSomething());

    // pola klasy
    /*
    String marka;
    String kolor;
    String model;
    int iloscDrzwi;
    int pojemnoscSilnika;

    public Auto() {
    }
    public Auto(String marka) {
        this.marka = marka;
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
*/
//    public static String TellSomething() {
//            String text = "Jestem " + marka + " mam kolor " + kolor + " model " + model + " ilość drzwi " + iloscDrzwi + " i " + pojemnoscSilnika + " cm2";
//            return text;
//        }
//
//        Figury kwadrat = new Figury();
//
//        kwadrat.setBok(-5);
//        System.out.println(kwadrat.obliczPoleKwadratu(7));
//
//        Auto honda = new Auto();
//        honda.marka = "Honda";
//
//        kwadrat.obliczPoleKwadratu(6);
//
//        System.out.println(kwadrat.obliczPoleProstokata(8, 9));

//trojkat.obliczPoleTrojkata(4,7);
//        System.out.println(trojkat.obliczPoleTrojkata(7,9));
//    }
}











