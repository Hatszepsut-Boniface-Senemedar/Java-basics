package tablice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTablice {

    @Test
    void validateCzyZawiera(){
        Tablica tab = new Tablica();
        int[] przyklad = {};
        boolean answer = tab.czyTablicaZawieraLiczbe(przyklad, 0);
        Assertions.assertFalse(answer);
    }
}
