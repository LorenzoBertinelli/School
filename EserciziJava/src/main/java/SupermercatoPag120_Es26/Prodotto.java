package SupermercatoPag120_Es26;


public class Prodotto {
    String codice;
    String descrizione;
    double prezzo;
    int quantitaNegozio;
    int quantitaMagazzino;

    public Prodotto(String codice, String descrizione, double prezzo, int quantitaNegozio, int quantitaMagazzino) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaNegozio = quantitaNegozio;
        this.quantitaMagazzino = quantitaMagazzino;
    }

    public void rifornimento(int quantita) {
        quantitaMagazzino += quantita;
    }

    public boolean vendita(int quantita) {
        if (quantita <= quantitaNegozio) {
            quantitaNegozio -= quantita;
            return true;
        }
        return false;
    }

    public boolean trasferimento(int quantita) {
        if (quantita <= quantitaMagazzino) {
            quantitaMagazzino -= quantita;
            quantitaNegozio += quantita;
            return true;
        }
        return false;
    }

    public int scortaTotale() {
        return quantitaNegozio + quantitaMagazzino;
    }

    public String dettagli() {
        return "Codice: " + codice + ", Descrizione: " + descrizione + ", Prezzo: " + prezzo +
               ", Quantità in Negozio: " + quantitaNegozio + ", Quantità in Magazzino: " + quantitaMagazzino;
    }
}