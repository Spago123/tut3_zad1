package ba.unsa.etf.rpr;

import java.util.*;

/**
 * Class that represents a name directory
 */
public class Imenik {
    private Map<String, TelefonskiBroj> imenik;

    /**
     * Default constructor
     */
    public Imenik() {
        this.imenik = new HashMap<>();
    }

    /**
     * Adds a number to the Imenik
     * @param ime user name
     * @param broj user number
     */
    void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    /**
     * Return the users number
     * @param ime user name
     * @return user number
     */
    String dajBroj(String ime) throws NepoznatKorisnik{
        if(!imenik.containsKey(ime)) throw new NepoznatKorisnik(ime);
        return imenik.get(ime).ispisi();
    }

    /**
     * Returns the users name
     * @param broj users number
     * @return users name, null if number does not exsits
     */
    String dajIme(TelefonskiBroj broj) throws NepoznatBroj{
        if(!imenik.containsValue(broj)) throw new NepoznatBroj(broj);
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if(entry.getValue().equals(broj))
                return entry.getKey();
        return null;
    }

    /**
     * Return a string that represent the collection of all users whose name begins with s
     * @param s char which represents the first letter od the name
     * @return string
     */
    String naSlovo(char s){
        String all_names = "";
        int i=0;
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if(entry.getKey().charAt(0) == s)
                all_names = all_names +  Integer.toString(++i) + ". " + entry.getKey() + " - " + entry.getValue().ispisi() + System.lineSeparator();

        return all_names;
    }

    /**
     * Returns all user that come from the city g
     * @param g a city defined by te enum type Grad
     * @return sorted set of names
     */
    Set<String> izGrada(Grad g){
        Set<String> imenaPrezimena = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if((entry.getValue() instanceof FiksniBroj) && ((FiksniBroj) entry.getValue()).getGrad().equals(g))
                imenaPrezimena.add(entry.getKey());
        return imenaPrezimena;
    }

    /**
     * Returns all numbers from the city g
     * @param g a city defined by the enum type Grad
     * @return sorted set of numbers
     */
    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> brojevi = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if((entry.getValue() instanceof FiksniBroj) && ((FiksniBroj) entry.getValue()).getGrad().equals(g))
                brojevi.add(entry.getValue());
        return brojevi;
    }
}
