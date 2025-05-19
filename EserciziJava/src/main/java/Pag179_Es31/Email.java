package Pag179_Es31;

/**
 * Rappresenta un'email con mittente, oggetto, data e ora, e testo.
 */
public class Email {
    private String mittente;
    private String oggetto;
    private String dataOra;
    private String testo;

    /**
     * Costruttore dell'email.
     * @param mittente il mittente dell'email
     * @param oggetto l'oggetto dell'email
     * @param dataOra la data e ora di ricezione
     * @param testo il contenuto dell'email
     */
    public Email(String mittente, String oggetto, String dataOra, String testo) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.dataOra = dataOra;
        this.testo = testo;
    }

    public String getMittente() {
        return mittente;
    }
     /**
      * 
      * @return String
      */
    public String getOggetto() {
        return oggetto;
    }

    public String getDataOra() {
        return dataOra;
    }

    public String getTesto() {
        return testo;
    }
}