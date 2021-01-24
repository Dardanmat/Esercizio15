package esercizi.esercizio15;
import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args) {
        
        //GIORNI
        Giorno g1 = new Giorno("Albania", "Un bel posticino, tutto costa meno, la gente è ospitale");
        Giorno g2 = new Giorno("Francia", "Terribile");
        Giorno g3 = new Giorno("Germania", "Ottimi Wurstel, fa freddo");
        Giorno g4 = new Giorno("Spagna", "Parlano in modo divertente");
        Giorno g5 = new Giorno("Danimarca", "Legoland!");
        Giorno g6 = new Giorno("Toscana", ":)");
        Giorno g7 = new Giorno("Casa", "Ho finito le idee");
        Giorno g8 = new Giorno("Scuola", "Una bella gita");
        Giorno g9 = new Giorno("Grecia", "Dovremmo andare in Grecia ma per un cambio di programma si va in Albania");
        
        //VIAGGI
        ArrayList<Giorno> giorni = new ArrayList<>();
        giorni.add(g7); 
        giorni.add(g8);
        giorni.add(g1);
        giorni.add(g6);
        giorni.add(g7);
        
        ArrayList<Giorno> giorni2 = new ArrayList<>();
        giorni2.add(g2); 
        giorni2.add(g4);
        giorni2.add(g5);
        giorni2.add(g6);
        giorni2.add(g7);
        
        ViaggioPerSingoli v1 = new ViaggioPerSingoli("Viaggio in Albania", 30); 
        v1.addGiorno(g1);
        v1.addGiorno(g9);
        
        ViaggioPerSingoli v2 = new ViaggioPerSingoli("Si va a scuola", 3, giorni);
        
        ViaggioPerGruppi v3 = new ViaggioPerGruppi(1, 10, "Danimarca, Legoland Edition", 1100);
        v3.addGiorno(g5);
        v3.addGiorno(g3);
        v3.addGiorno(g2);
        v3.addGiorno(g8);
        v3.addGiorno(g6);
        
        ViaggioPerGruppi v4 = new ViaggioPerGruppi(10, 50, "Francia e Spagna , Ultimate Edition", 1600, giorni2);
        
        
        //AGENZIA
        Agenzia agenzia = new Agenzia("Euroviaggi");
        
        agenzia.addViaggio(v1);
        agenzia.addViaggio(v2);
        agenzia.addViaggio(v3);
        agenzia.addViaggio(v4);
        
        System.out.println(agenzia.toString());
        
        System.out.println("\nLista Viaggi con un costo minore di 900€\n");
        for(Viaggio v: agenzia.listaViaggiConCostoMinore(900)){
            System.out.println(v.toString() + "\n");
        }
        
        System.out.println("\nLista Viaggi con 10 partecipanti minimi\n");
        for(ViaggioPerGruppi v: agenzia.listaViaggiGruppiPerPartecimantiMinimi(10)){
            System.out.println(v.toString() + "\n");
        }
        
        System.out.println("\nLista Viaggi con che vanno in Albania\n");
        for(Viaggio v:agenzia.listaViaggiSingoliStessaLocalita("Albania")){
            System.out.println(v.toString() + "\n");
        }
        
        System.out.println("\nLista Viaggi con più di 3 giorni\n");
        for(Viaggio v:agenzia.listaViaggiPerGruppiConNumGiorniSuperiore(3)){
            System.out.println(v.toString() + "\n");
        }
    }
    
}
