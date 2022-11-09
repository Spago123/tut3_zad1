package ba.unsa.etf.rpr;


/**
 * An exception that is thrown when we search a name in Imenik that does not exsits
 */
public class NepoznatKorisnik extends Exception{
    public NepoznatKorisnik(String nepoznatKorinsik){
        super(nepoznatKorinsik + " ne postojin u imeniku!");
    }
}
