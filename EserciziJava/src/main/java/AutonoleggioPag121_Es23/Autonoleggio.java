package AutonoleggioPag121_Es23;

public class Autonoleggio {
    private Veicolo[] veicoli; // Array per memorizzare i veicoli
    private int numeroVeicoli; // Numero attuale di veicoli nell'array
    private int codiceIncrementale; // Codice incrementale per i nuovi veicoli

    // Costruttore per inizializzare l'autonoleggio con una capacità specificata
    public Autonoleggio(int capacita) {
        this.veicoli = new Veicolo[capacita]; // Inizializza l'array di veicoli
        this.numeroVeicoli = 0; // Inizializza il conteggio dei veicoli
        this.codiceIncrementale = 1; // Inizializza il codice incrementale
    }

    // Metodo per aggiungere un veicolo all'autonoleggio
    public void aggiungiVeicolo(String targa, String marca, String modello, int numeroPosti) throws Exception {
        // Controlla se è possibile aggiungere un nuovo veicolo
        if (numeroVeicoli >= veicoli.length) {
            throw new Exception("Capacità massima raggiunta."); // Solleva un'eccezione se la capacità è piena
        }
        // Crea un nuovo veicolo e lo aggiunge all'array
        Veicolo veicolo = new Veicolo(codiceIncrementale++, targa, marca, modello, numeroPosti);
        veicoli[numeroVeicoli++] = veicolo; // Aggiungi il veicolo e incrementa il conteggio
    }

    // Metodo per eliminare un veicolo dall'autonoleggio
    public void eliminaVeicolo(int codice, String targa) throws Exception {
        // Cerca il veicolo da eliminare
        for (int i = 0; i < numeroVeicoli; i++) {
            if (veicoli[i].getCodice() == codice && veicoli[i].getTarga().equals(targa)) {
                // Sostituisci il veicolo da eliminare con l'ultimo veicolo nell'array
                veicoli[i] = veicoli[numeroVeicoli - 1];
                veicoli[numeroVeicoli - 1] = null; // Rimuovi l'ultimo veicolo
                numeroVeicoli--; // Decrementa il conteggio dei veicoli
                return; // Esci dal metodo
            }
        }
        throw new Exception("Veicolo non trovato."); // Solleva un'eccezione se il veicolo non è trovato
    }

    // Metodo per cercare un veicolo specifico
    public Veicolo ricercaVeicolo(int codice, String targa) throws Exception {
        // Cerca il veicolo nell'array
        for (int i = 0; i < numeroVeicoli; i++) {
            if (veicoli[i].getCodice() == codice && veicoli[i].getTarga().equals(targa)) {
                return veicoli[i]; // Restituisce il veicolo trovato
            }
        }
        throw new Exception("Veicolo non trovato."); // Solleva un'eccezione se il veicolo non è trovato
    }

    // Metodo per cercare veicoli per numero di posti
    public Veicolo[] ricercaVeicoliPerPosti(int numeroPosti) {
        Veicolo[] risultati = new Veicolo[numeroVeicoli]; // Array temporaneo per i risultati
        int count = 0; // Contatore per i risultati trovati
        // Cerca veicoli con il numero di posti specificato
        for (int i = 0; i < numeroVeicoli; i++) {
            if (veicoli[i].getNumeroPosti() == numeroPosti) {
                risultati[count++] = veicoli[i]; // Aggiungi il veicolo ai risultati
            }
        }
        // Riduci l'array ai risultati trovati
        Veicolo[] risultatiFinali = new Veicolo[count];
        System.arraycopy(risultati, 0, risultatiFinali, 0, count); // Copia i risultati nell'array finale
        return risultatiFinali; // Restituisce l'array di risultati
    }

    // Metodo per visualizzare l'inventario (da implementare)
    public void inventario() {
        // Implementazione inventario
        // Utilizzare un Map<String, Integer> per contare i veicoli per marca
    }
}