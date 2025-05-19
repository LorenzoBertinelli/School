/*In un'APP abilitata alla ricezione
della posta elettronica le e-mail sono mantenute in una lista ordinata in cui vengono inserite al momento della ricezione. 
Per ogni e-mail devono essere memorizzate le seguenti informazioni:
•mittente;
oggetto;
• data e ora;
• testo.
Progettare mediante un diagramma delle classi UML e implementare in linguaggio
Java una classe Mailbox che consenta di eseguire le seguenti operazioni, gestendo in modo adeguato le relative eccezioni:
• aggiunta di un'e-mail alla lista tenendo conto che l'ultima ricevuta è sempre la prima della lista;
• eliminazione di un'e-mail data la sua posizione nella lista;
•
ricerca di tutte le e-mail che contengono uno specifico testo nell'oggetto (la classe String dispone del metodo contains che restituisce 
un valore booleano a seconda che un oggetto di tipo String contenga o meno come sottostringa la stringa fornita come argomento).*/
package Pag179_Es31;

/**
 * Classe di test per la casella di posta elettronica.
 */
public class Main {
    public static void main(String[] args) {
        Mailbox mailbox = new Mailbox();

        // Creazione di alcune email
        Email email1 = new Email("mario@esempio.com", "Ciao", "2025-05-09 12:00", "Ciao, come stai?");
        Email email2 = new Email("lucia@esempio.com", "Offerta lavoro", "2025-05-09 12:30", "Hai visto l'offerta?");
        Email email3 = new Email("giovanni@esempio.com", "Saluti", "2025-05-09 13:00", "Ti mando un saluto!");

        // Aggiunta delle email
        mailbox.aggiungiEmail(email1);
        mailbox.aggiungiEmail(email2);
        mailbox.aggiungiEmail(email3);
        mailbox.visita();

        // Visualizzazione
        System.out.println("Email nella casella:");
        mailbox.mostraEmail();

        // Ricerca
        System.out.println("\nRicerca email con oggetto contenente 'Ciao':");
        mailbox.ricercaEmail("Ciao");

        // Eliminazione
        System.out.println("\nEliminazione email in posizione 1:");
        mailbox.eliminaEmail(1);

        // Visualizzazione aggiornata
        System.out.println("\nEmail dopo eliminazione:");
        mailbox.mostraEmail();
    }
}