package Pag179_Es31;

/**
 * Rappresenta un nodo della lista concatenata contenente un'email.
 */
public class Nodo {
    private Email email;
    private Nodo next;

    /**
     * Costruttore del nodo.
     * @param email l'oggetto Email contenuto nel nodo
     */
    public Nodo(Email email) {
        this.email = email;
        this.next = null;
    }

    /**
     * Restituisce l'email contenuta nel nodo.
     * @return l'email
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Imposta una nuova email nel nodo.
     * @param email l'email da impostare
     */
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * Restituisce il nodo successivo.
     * @return il nodo successivo
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * Imposta il nodo successivo.
     * @param next il nodo successivo
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
}