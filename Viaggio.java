package esercizi.esercizio15;
import java.util.ArrayList;

public class Viaggio {
    
    private String titolo;
    private double costoBase;
    private ArrayList<Giorno> listaGiorni;
    private static double quotaFissaGiornaliera = 20;

    @Override
    public String toString() {
        return "Titolo Viaggio: "+ titolo 
                + "\n - Costo Base: "+ costoBase 
                + "\n - Quota Giornaliera: "+ quotaFissaGiornaliera
                + "\n - Costo Totale: "+ getCosto();
    }
    
    public double getQuotaFissaGiornaliera(){
        return quotaFissaGiornaliera;
    }
    
    public Viaggio(String titolo, double costoBase, ArrayList<Giorno> listaGiorni) {
        this.titolo = titolo;
        this.costoBase = costoBase;
        this.listaGiorni = listaGiorni;
    }
    
    public Viaggio(String titolo, double costoBase) {
        this.titolo = titolo;
        this.costoBase = costoBase;
        this.listaGiorni = new ArrayList<>();
    }
    
    public Viaggio() {
        this.titolo = "";
        this.costoBase = 0;
        this.listaGiorni = new ArrayList<>();
    }
    
    public boolean addGiorno(Giorno g){   
        return listaGiorni.add(g); 
    }
    
    public boolean removeGiorno(int numOrdine){
        
        for(Giorno g: listaGiorni){
            if(g.getNumOrdine() == numOrdine) {
                return listaGiorni.remove(g);
            }
        }
        return false;
    }
    
    public boolean removeGiorno(Giorno giorno){
        
        for(Giorno g: listaGiorni){
            if(g.equals(g)) {
                return listaGiorni.remove(g);
            }
        }
        return false;
    }
    
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public ArrayList<Giorno> getListaGiorni() {
        return listaGiorni;
    }

    public void setListaGiorni(ArrayList<Giorno> listaGiorni) {
        this.listaGiorni = listaGiorni;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Viaggio){
            if(((Viaggio)obj).getTitolo().equalsIgnoreCase(this.titolo)) {
                return true;
            }
        }
        return false;
    }
    
    public double getCosto(){  
        return this.costoBase + (quotaFissaGiornaliera*listaGiorni.size());
    }
}
