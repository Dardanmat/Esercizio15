package esercizi.esercizio15;


public class Giorno {
    
    private static int numOrdini = 1;
    
    private int numOrdine;
    private String nomeLuogo;
    private String descrizione;
    
    @Override
    public String toString() {
        return "Giorno num."+numOrdine + "\n - Luogo: "+ nomeLuogo + "\n - Descrizione: " + descrizione;
    }

    public Giorno(int numOrdine, String nomeLuogo, String descrizione) {
        this.numOrdine = numOrdine;
        this.nomeLuogo = nomeLuogo;
        this.descrizione = descrizione;
    }
    
    public Giorno(String nomeLuogo, String descrizione) {
        this.numOrdine = numOrdini;
        this.numOrdini++;
        this.nomeLuogo = nomeLuogo;
        this.descrizione = descrizione;
    }
    
    public Giorno() {
        this.numOrdine = 0;
        this.nomeLuogo = "";
        this.descrizione = "";
    }
    
    public Giorno(Giorno g) {
        this.numOrdine = g.getNumOrdine();
        this.nomeLuogo = g.getNomeLuogo();
        this.descrizione = g.getDescrizione();
    }
    
    public int getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(int numOrdine) {
        this.numOrdine = numOrdine;
    }

    public String getNomeLuogo() {
        return nomeLuogo;
    }

    public void setNomeLuogo(String nomeLuogo) {
        this.nomeLuogo = nomeLuogo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Giorno){
            if(this.numOrdine == ((Giorno)obj).getNumOrdine()){
                return true;
            }
        }
        return false;
    }
}
