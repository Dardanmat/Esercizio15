package esercizi.esercizio15;

import java.util.ArrayList;


public class ViaggioPerSingoli extends Viaggio{
    
    @Override
    public String toString() {
        return "Viaggio per Singoli\n" + super.toString();
    }
    
    public ViaggioPerSingoli(String titolo, double costoBase, ArrayList<Giorno> listaGiorni) {
        super(titolo, costoBase, listaGiorni);
    }

    public ViaggioPerSingoli(String titolo, double costoBase) {
        super(titolo, costoBase);
    }

    public ViaggioPerSingoli() {
    }

    @Override
    public double getCosto() {
        return super.getCosto();
    }
    
}
