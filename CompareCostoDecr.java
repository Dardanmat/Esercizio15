package esercizi.esercizio15;
import java.util.Comparator;

public class CompareCostoDecr implements Comparator<Viaggio>{
    
    @Override
    public int compare(Viaggio o1, Viaggio o2) {
        if(o1.getCosto()==o2.getCosto()) return 0;
        if(o1.getCosto()>o2.getCosto()) return -1;
        if(o1.getCosto()<o2.getCosto()) return 1;
        return 0;
    }  
    
}
