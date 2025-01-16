package Libro;

/**
 *
 * @author Lorenzo
 */
public class Mensola {
    // Attributi
    private static final int MAX_NUM_VOLUMI = 15;
    private Libro[] volumi;

    // Costruttori
    public Mensola() {
        volumi = new Libro[MAX_NUM_VOLUMI];
    }

    public Mensola(Mensola mensola) {
        volumi = new Libro[MAX_NUM_VOLUMI];
        for (int posizione = 0; posizione < MAX_NUM_VOLUMI; posizione++) {
            if (mensola.getVolume(posizione) != null) {
                volumi[posizione] = mensola.getVolume(posizione);
            }
        }
    }

    // Metodi
    public int setVolume(Libro libro, int posizione) {
        if ((posizione < 0) || (posizione >= MAX_NUM_VOLUMI)) {
            return -1; // posizione non valida
        }
        if (volumi[posizione] != null) {
            return -2; // posizione occupata
        }
        volumi[posizione] = libro; // inserimento libro in posizione
        return posizione; // restituisce la posizione di inserimento
    }

    public Libro getVolume(int posizione) {
        if ((posizione < 0) || (posizione >= MAX_NUM_VOLUMI)) {
            return null; // posizione non valida: nessun libro restituito
        }
        return volumi[posizione]; // restituisce il libro in posizione
    }

    public int rimuoviVolume(int posizione) {
        if ((posizione < 0) || (posizione >= MAX_NUM_VOLUMI)) {
            return -1; // posizione non valida
        }
        if (volumi[posizione] == null) {
            return -2; // posizione vuota
        }
        volumi[posizione] = null; // rimozione libro in posizione
        return posizione; // restituisce la posizione liberata
    }

    public int getNumMaxVolumi() {
        return MAX_NUM_VOLUMI;
    }

    public int getNumVolumi() {
        int n = 0;
        for (int posizione = 0; posizione < MAX_NUM_VOLUMI; posizione++) {
            if (volumi[posizione] != null) {
                n++;
            }
        }
        return n;
    }
}