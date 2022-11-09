package ba.unsa.etf.rpr;

/**
 * Program that lets you manipulate with numbers
 * @author Harun Spago
 * @version 1.0
 */
public class Program {
    public static void main( String[] args ) throws NepoznatBroj, NepoznatKorisnik {
        TelefonskiBroj t1 = new FiksniBroj(Grad.ZENICA,"123123");
        TelefonskiBroj t2 = new MobilniBroj(60, "3275030");
        TelefonskiBroj t3 = new FiksniBroj(Grad.ZENICA,"6549693");
        System.out.println( t1.ispisi() );
        System.out.println(t2.ispisi());
        System.out.println(t3.ispisi());
        Imenik imenik = new Imenik();
        imenik.dodaj("Harun Spago",t2);
        imenik.dodaj("HAsa Cazim",t1);
        imenik.dodaj("Ahmed HIJ",t3);
        System.out.println(imenik.dajIme(t3));
        System.out.println(imenik.dajBroj("Harun Spago"));
        System.out.println(imenik.naSlovo('H'));
        System.out.println(imenik.izGrada(Grad.ZENICA));
        for(TelefonskiBroj broj : imenik.izGradaBrojevi(Grad.ZENICA))
            System.out.println(broj.ispisi());
    }
}
