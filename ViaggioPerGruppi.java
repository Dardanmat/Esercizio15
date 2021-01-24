package esercizi.esercizio15;

import java.util.ArrayList;


public class ViaggioPerGruppi extends Viaggio{
    
    private int minNumPartecipanti;
    private int maxPartecipanti;  
    private static double quotaGruppo = 2;

    @Override
    public String toString() {
        return "Viaggio per Gruppi\nTitolo Viaggio: "+ super.getTitolo()
                + "\n - Costo Base: "+ super.getCostoBase()
                + "\n - Quota Giornaliera: "+ super.getQuotaFissaGiornaliera()
                + "\n - Costo Totale: "+ getCosto();
    }
    
    
    
    public ViaggioPerGruppi(int minNumPartecipanti, int maxPartecipanti, String titolo, double costoBase, ArrayList<Giorno> listaGiorni) {
        super(titolo, costoBase, listaGiorni);
        this.minNumPartecipanti = minNumPartecipanti;
        this.maxPartecipanti = maxPartecipanti;
    }

    public ViaggioPerGruppi(int minNumPartecipanti, int maxPartecipanti, String titolo, double costoBase) {
        super(titolo, costoBase);
        this.minNumPartecipanti = minNumPartecipanti;
        this.maxPartecipanti = maxPartecipanti;
    }

    public ViaggioPerGruppi() {
        this.minNumPartecipanti = 0;
        this.maxPartecipanti = 0;
    }

    @Override
    public double getCosto() {
        return super.getCosto() + (quotaGruppo*maxPartecipanti);
    }

    public int getMinNumPartecipanti() {
        return minNumPartecipanti;
    }

    public void setMinNumPartecipanti(int minNumPartecipanti) {
        this.minNumPartecipanti = minNumPartecipanti;
    }

    public int getMaxPartecipanti() {
        return maxPartecipanti;
    }

    public void setMaxPartecipanti(int maxPartecipanti) {
        this.maxPartecipanti = maxPartecipanti;
    }
    
    public double getQuotaGruppo(){
        return quotaGruppo;
    }
    
}
