package ba.unsa.etf.rpr;

/**
 * MobilniBroj represents a mobile phone number
 */

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return Integer.toString(mobilnaMreza) + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
