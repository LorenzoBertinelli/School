package ScuolaPag189;

public class Dipendente {
    private String nominativo;
    private char genere;
    private String indirizzo;

    public Dipendente(String nominativo, char genere, String indirizzo) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.indirizzo = indirizzo;
    }

    public String getNominativo() {
        return nominativo;
    }

    public char getGenere() {
        return genere;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
