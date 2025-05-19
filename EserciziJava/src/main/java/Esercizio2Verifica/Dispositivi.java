package Esercizio2Verifica;

/**
 * Interfaccia Dispositivi.
 * Questa interfaccia rappresenta una tipologia di componenti elettronici.
 * Contiene un metodo per confrontare due oggetti.
 */
public interface Dispositivi {

    /**
     * Confronta l'oggetto corrente con un altro oggetto.
     *
     * @param X L'oggetto da confrontare con l'oggetto corrente.
     * @return true se gli oggetti sono considerati uguali, false altrimenti.
     */
    boolean uguale(Object X);
}
