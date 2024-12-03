package Studente;

public class Studente {
    // Variabili di istanza della classe Studente
    private Voto[] vetVoti; // Array per memorizzare i voti
    private String nome;
    private String cognome;
    private int indiceVotoCorrente = 0; // Contatore per il numero di voti inseriti

    // Costruttore per inizializzare nome, cognome e array voti
    public Studente(String nome, String cognome, int numeroVoti) {
        this.nome = nome;
        this.cognome = cognome;
        this.vetVoti = new Voto[numeroVoti];
    }

    // Metodo per aggiungere un voto allo studente
    public void aggiungiVoto(Voto voto) {
        if (indiceVotoCorrente < vetVoti.length) {
            vetVoti[indiceVotoCorrente] = voto;
            indiceVotoCorrente++;
        }
    }

    // Metodo per calcolare la media dei voti
    public float calcolaMedia() {
        if (indiceVotoCorrente == 0) return 0;
        float somma = 0;
        for (int i = 0; i < indiceVotoCorrente; i++) {
            somma += vetVoti[i].getVoto();
        }
        return somma / indiceVotoCorrente;
    }

    // Metodo per trovare il voto massimo
    public float votoMAX() {
        if (indiceVotoCorrente == 0) return 0;
        float max = vetVoti[0].getVoto();
        for (int i = 1; i < indiceVotoCorrente; i++) {
            if (vetVoti[i].getVoto() > max) {
                max = vetVoti[i].getVoto();
            }
        }
        return max;
    }

    // Metodo per restituire il voto più alto di una materia specifica
    public float votoPiuAltoMateria(String materia) {
        float maxVoto = -1; // Inizializzato a -1 per indicare l'assenza di voti per la materia
        for (int i = 0; i < indiceVotoCorrente; i++) {
            if (vetVoti[i].getMateria().equalsIgnoreCase(materia) && vetVoti[i].getVoto() > maxVoto) {
                maxVoto = vetVoti[i].getVoto();
            }
        }
        
        // Se maxVoto è rimasto -1, significa che non sono stati trovati voti per la materia richiesta
        if (maxVoto == -1) {
            System.out.println("Nessun voto trovato per la materia " + materia);
        } else {
            System.out.println("Il voto piu' alto per la materia " + materia + " e': " + maxVoto);
        }
        
        return maxVoto;
    }

    // Metodo per restituire i voti più alti con la materia di appartenenza
    public void votoPiuAltoTotale() {
        float maxVoto = votoMAX(); // Usa il metodo votoMAX() per ottenere il voto più alto

        // Stampa ogni voto uguale al massimo con la rispettiva materia
        System.out.println("Voto/i piu' alto/i tra tutte le materie:");
        for (int i = 0; i < indiceVotoCorrente; i++) {
            if (vetVoti[i].getVoto() == maxVoto) {
                System.out.println("Materia: " + vetVoti[i].getMateria() + ", Voto: " + vetVoti[i].getVoto());
            }
        }
    }

    // Metodo per stampare le informazioni dello studente
    public void stampaInfo() {
        System.out.println("Studente: " + nome + " " + cognome);
        System.out.println("Media dei voti: " + calcolaMedia());
        System.out.println("Voto massimo: " + votoMAX());
    }
}