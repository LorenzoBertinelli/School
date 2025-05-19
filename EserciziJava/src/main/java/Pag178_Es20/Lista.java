package Pag178_Es20;

public class Lista {
    private Nodo head;

    public Lista() {
        this.head = null;
    }

    // Metodo per inserire un nodo
    public void inserisci(String informazione) {
        Nodo nuovoNodo = new Nodo(informazione);
        nuovoNodo.next = head;
        head = nuovoNodo;
    }

    // Metodo erase per rimuovere tutte le occorrenze
    public int erase(String informazione) {
        int count = 0;
        Nodo current = head;
        Nodo previous = null;

        while (current != null) {
            if (current.informazione.equals(informazione)) {
                // Nodo da rimuovere
                if (previous == null) {
                    // Rimuoviamo il nodo head
                    head = current.next;
                } else {
                    // Rimuoviamo il nodo corrente
                    previous.next = current.next;
                }
                count++; // Incrementa il conteggio dei nodi rimossi
            } else {
                previous = current; // Avanza il nodo precedente
            }
            current = current.next; // Avanza al nodo successivo
        }

        return count; // Restituisce il numero di nodi rimossi
    }

    // Metodo per visualizzare la lista
    public void visualizza() {
        Nodo current = head;
        while (current != null) {
            System.out.print(current.informazione + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}