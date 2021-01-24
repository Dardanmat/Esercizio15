package esercizi.esercizio15;
import java.util.Comparator;

public class CompareNumeroGiorniViaggio implements Comparator<Viaggio>{
    
    @Override
    public int compare(Viaggio o1, Viaggio o2) {
        if(o1.getListaGiorni().size()==o2.getListaGiorni().size()) return 0;
        if(o1.getListaGiorni().size()>o2.getListaGiorni().size()) return -1;
        if(o1.getListaGiorni().size()<o2.getListaGiorni().size()) return 1;
        return 0;
    }
    
}
