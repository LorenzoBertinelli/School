package Pag179_Es31;

/**
 * Rappresenta una casella di posta elettronica.
 * Le email sono memorizzate in una lista concatenata in ordine LIFO.
 */
public class Mailbox {
    private Nodo lista;

    /**
     * Costruttore. Inizializza una casella di posta vuota.
     */
    public Mailbox() {
        this.lista = null;
    }

    /**
     * Aggiunge una nuova email in cima alla lista.
     * @param email l'email da aggiungere
     */
    public void aggiungiEmail(Email email) {
        Nodo nuovoNodo = new Nodo(email);
        nuovoNodo.setNext(lista);
        lista = nuovoNodo;
    }

    /**
     * Elimina un'email in base alla sua posizione nella lista.
     * @param indice la posizione dell'email da eliminare (0 = prima email)
     * @throws IndexOutOfBoundsException se l'indice è fuori dal range
     */
    public void eliminaEmail(int indice) throws IndexOutOfBoundsException {
        if (lista == null) {
            throw new IndexOutOfBoundsException("La lista è vuota.");
        }

        Nodo corrente = lista;
        Nodo precedente = null;
        int count = 0;

        while (corrente != null) {
            if (count == indice) {
                if (precedente == null) {
                    lista = corrente.getNext();
                } else {
                    precedente.setNext(corrente.getNext());
                }
                return;
            }
            precedente = corrente;
            corrente = corrente.getNext();
            count++;
        }

        throw new IndexOutOfBoundsException("Indice non valido.");
    }

    /**
     * Cerca e stampa tutte le email che contengono una determinata sottostringa nell'oggetto.
     * @param sottostringa la stringa da cercare nell'oggetto dell'email
     */
    public void ricercaEmail(String sottostringa) {
        Nodo corrente = lista;
        boolean trovato = false;

        while (corrente != null) {
            if (corrente.getEmail().getOggetto().contains(sottostringa)) {
                System.out.println("Email trovata: " + corrente.getEmail().getOggetto());
                trovato = true;
            }
            corrente = corrente.getNext();
        }

        if (!trovato) {
            System.out.println("Nessuna email trovata con '" + sottostringa + "' nell'oggetto.");
        }
    }
    
    public void visita(){
        Nodo corrente = lista;
        while(corrente != null){
            System.out.println(corrente.getEmail().getMittente());
            corrente = corrente.getNext();
        }
    }

    /**
     * Stampa tutte le email presenti nella casella di posta.
     */
    public void mostraEmail() {
        Nodo corrente = lista;
        if (corrente == null) {
            System.out.println("La casella di posta è vuota.");
        } else {
            while (corrente != null) {
                Email email = corrente.getEmail();
                System.out.println("Mittente: " + email.getMittente());
                System.out.println("Oggetto: " + email.getOggetto());
                System.out.println("Data e Ora: " + email.getDataOra());
                System.out.println("Testo: " + email.getTesto());
                System.out.println("-------------------------------------------------");
                corrente = corrente.getNext();
            }
        }
    }
}