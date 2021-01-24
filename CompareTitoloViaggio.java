package esercizi.esercizio15;
import java.util.Comparator;


public class CompareTitoloViaggio implements Comparator<Viaggio>{
    
    @Override
    public int compare(Viaggio o1, Viaggio o2) {
        return o1.getTitolo().compareToIgnoreCase(o2.getTitolo());
    }
    
}
