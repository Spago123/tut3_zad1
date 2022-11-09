package ba.unsa.etf.rpr;

/**
 * Class that represents an international phone number
 */
public class MedunarodniBroj extends TelefonskiBroj{
    public String drzava;
    public String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
