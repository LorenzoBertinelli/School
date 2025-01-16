package Libro;

//istanziare: riservare nella memoria di sistema lo spazio necessario per quel determinato oggetto, questo si fra tramite il new
public class Main {

    public static void main(String[] args) {
        // Istanziare due libri
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1216);
        Libro libro2 = new Libro("1984", "George Orwell", 328);

        // Calcolare e stampare il costo di ogni libro
        libro1.stampaInfo();
        System.out.println(); // Riga vuota per separare i due output
        libro2.stampaInfo();

        // Creare una mensola
        Mensola mensola = new Mensola();

        // Aggiungere i libri alla mensola
        System.out.println("\nAggiunta dei libri alla mensola:");
        int posizione1 = mensola.setVolume(libro1, 0); // Posizione 0
        int posizione2 = mensola.setVolume(libro2, 1); // Posizione 1

        // Verifica e stampa dei risultati
        if (posizione1 >= 0) {
            System.out.println("Libro aggiunto alla posizione " + posizione1);
        } else {
            System.out.println("Errore durante l'aggiunta di 'Il Signore degli Anelli'.");
        }

        if (posizione2 >= 0) {
            System.out.println("Libro aggiunto alla posizione " + posizione2);
        } else {
            System.out.println("Errore durante l'aggiunta di '1984'.");
        }

        // Stampare i libri presenti nella mensola
        System.out.println("\nLibri presenti nella mensola:");
        for (int i = 0; i < mensola.getNumMaxVolumi(); i++) {
            Libro libro = mensola.getVolume(i);
            if (libro != null) {
                System.out.print("Posizione " + i + ": ");
                libro.stampaInfo();
            }
        }

        // Rimuovere un libro dalla mensola
        System.out.println("\nRimozione di un libro dalla mensola:");
        int rimuoviPosizione = mensola.rimuoviVolume(1); // Rimuoviamo il libro alla posizione 1
        if (rimuoviPosizione >= 0) {
            System.out.println("Libro rimosso dalla posizione " + rimuoviPosizione);
        } else {
            System.out.println("Errore durante la rimozione del libro.");
        }

        // Stampare nuovamente i libri presenti nella mensola
        System.out.println("\nLibri presenti nella mensola dopo la rimozione:");
        for (int i = 0; i < mensola.getNumMaxVolumi(); i++) {
            Libro libro = mensola.getVolume(i);
            if (libro != null) {
                System.out.print("Posizione " + i + ": ");
                libro.stampaInfo();
            }
        }
    }
}