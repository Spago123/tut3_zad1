package ba.unsa.etf.rpr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void nepoznatKorisnik() throws NepoznatKorisnik {
        Assertions.assertThrows(NepoznatKorisnik.class, () -> {
            Imenik imenik = new Imenik();
            imenik.dajBroj("Harun");
        });
    }

    @Test
    public void nepoznatBroj() throws NepoznatBroj{
        Assertions.assertThrows(NepoznatBroj.class, () ->{
            Imenik imenik = new Imenik();
            imenik.dajIme(new FiksniBroj(Grad.ZENICA,"945678"));
        });
    }
    @Test
    public void imenaNaSlovo(){
        Imenik imenik = new Imenik();
        imenik.dodaj("Harun Spago", new MobilniBroj(60,"3275030"));
        imenik.dodaj("HAsa Cazim", new FiksniBroj(Grad.ZENICA, "123123"));
        Assertions.assertEquals("1. HAsa Cazim - 032/123123" + System.lineSeparator() +
                "2. Harun Spago - 60/3275030" + System.lineSeparator(), imenik.naSlovo('H'));
    }

    @Test
    public void mockinTest() throws NepoznatBroj {
        MobilniBroj mobMoc = Mockito.mock(MobilniBroj.class);
        mobMoc = new MobilniBroj(34,"456789");

        Imenik imenik = Mockito.mock(Imenik.class);
        imenik.dodaj("Mahmud",mobMoc);

        Mockito.when(imenik.dajIme(mobMoc)).thenReturn("Konj");
        assertEquals("Konj",imenik.dajIme(mobMoc));
    }
}
