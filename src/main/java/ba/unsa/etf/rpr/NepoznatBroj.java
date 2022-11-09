package ba.unsa.etf.rpr;

/**
 * An exception that is thrown when we search a number that does not exsits in Imenik
 */
public class NepoznatBroj extends Exception{
    public NepoznatBroj(TelefonskiBroj broj){
        super(broj.ispisi() + " ne postoji u imeniku!");
    }
}
