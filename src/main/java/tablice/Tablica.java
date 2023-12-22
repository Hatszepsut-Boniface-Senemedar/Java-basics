package tablice;

public class Tablica {

    public static void main(String[] args) {


        int dzielnik = 2;
        int[] liczbyPierwsze = {1, 2, 3, 5, 7};
//        if (Arrays.asList(liczbyPierwsze).contains(dzielnik)) {
//            System.out.println("nie jest to liczba pierwsza");
//        }

        Tablica tablica = new Tablica();

        boolean answer = tablica.czyTablicaZawieraLiczbe(liczbyPierwsze, dzielnik);
        System.out.println(answer);

    }

    boolean czyTablicaZawieraLiczbe(int[] tablica, int dzielnik){

        for(int i=0; i < tablica.length; i = i +1){
            if(tablica[i] == dzielnik){
                return true;
            }
        }

        return false;
    }

}
