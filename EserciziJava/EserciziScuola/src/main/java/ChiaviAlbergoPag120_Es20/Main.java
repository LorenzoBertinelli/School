package ChiaviAlbergoPag120_Es20;

public class Main {
    public static void main(String[] args) {
        Portachiavi portachiavi = new Portachiavi(50); // Portachiavi con una capacità massima di 50 chiavi

        // Aggiunta di alcune chiavi
        portachiavi.lasciaChiave(101, "Mario Rossi");
        portachiavi.lasciaChiave(102, "Giulia Bianchi");
        portachiavi.lasciaChiave(103, "Luca Verdi");

        // Visualizza le chiavi attuali
        portachiavi.visualizzaChiavi();

        // Prelievo della chiave per numero camera
        portachiavi.prendiChiave(101);

        // Prelievo della chiave per nominativo cliente
        portachiavi.prendiChiave("Giulia Bianchi");

        // Visualizza le chiavi rimanenti
        portachiavi.visualizzaChiavi();

        // Prova a prendere una chiave inesistente
        portachiavi.prendiChiave(105);
        portachiavi.prendiChiave("Marco Neri");
    }
}