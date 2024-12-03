package StrumentiLaboratorioScuolaPag120_Es25;

// Classe che rappresenta uno strumento di laboratorio
public class Strumento {
    private int numeroIdentificativo; // Numero identificativo dello strumento
    private String descrizione;         // Descrizione sintetica dello strumento
    private int annoAcquisto;          // Anno di acquisto dello strumento
    private int annoGaranzia;          // Anno di scadenza della garanzia

    // Costruttore per inizializzare le informazioni dello strumento
    public Strumento(int numeroIdentificativo, String descrizione, int annoAcquisto, int annoGaranzia) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.descrizione = descrizione;
        this.annoAcquisto = annoAcquisto;
        this.annoGaranzia = annoGaranzia;
    }

    // Metodi getter
    public int getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public int getAnnoGaranzia() {
        return annoGaranzia;
    }

    // Metodi setter
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

    public void setAnnoGaranzia(int annoGaranzia) {
        this.annoGaranzia = annoGaranzia;
    }
}