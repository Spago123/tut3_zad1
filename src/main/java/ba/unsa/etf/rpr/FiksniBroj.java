package ba.unsa.etf.rpr;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that represents a fixed phone number
 */

public class FiksniBroj extends TelefonskiBroj implements Comparable {
    private Grad grad;
    private String broj;
    private Map<Grad, String> pozivniBrojevi = new HashMap<>();
    {
        pozivniBrojevi.put(Grad.SARAJEVO,"033");
        pozivniBrojevi.put(Grad.ZENICA,"032");
        pozivniBrojevi.put(Grad.TRAVNIK,"030");
        pozivniBrojevi.put(Grad.BIHAC,"037");
        pozivniBrojevi.put(Grad.ORASJE,"031");
        pozivniBrojevi.put(Grad.GORAZDE,"038");
        pozivniBrojevi.put(Grad.TUZLA,"035");
        pozivniBrojevi.put(Grad.SIROKI_BRIJEG,"039");
        pozivniBrojevi.put(Grad.LIVNO,"034");
        pozivniBrojevi.put(Grad.BRCKO,"049");
        pozivniBrojevi.put(Grad.MOSTAR,"036");
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }


    @Override
    public String ispisi() {
        return pozivniBrojevi.get(grad) + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        if(o == this)
            return 0;
        if(! (o instanceof FiksniBroj))
            return -1;
        return this.broj.compareTo(((FiksniBroj) o).getBroj());
    }
}
