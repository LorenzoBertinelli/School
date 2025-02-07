package AgenziaCollocamento;

public class Corso {
    private String codice;
    private String nome;
    private String cognomeDocente;
    private int numeroOre;
    private int numeroMassimoIscritti;
    private int numeroIscritti;

    public Corso(String codice, String nome, String cognomeDocente, int numeroOre, int numeroMassimoIscritti) {
        this.codice = codice;
        this.nome = nome;
        this.cognomeDocente = cognomeDocente;
        this.numeroOre = numeroOre;
        this.numeroMassimoIscritti = numeroMassimoIscritti;
        this.numeroIscritti = 0;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getCognomeDocente() {
        return cognomeDocente;
    }

    public int getNumeroOre() {
        return numeroOre;
    }

    public int getNumeroMassimoIscritti() {
        return numeroMassimoIscritti;
    }

    public int postiDisponibili() {
        return numeroMassimoIscritti - numeroIscritti;
    }

    public void aggiungiIscritti(int numero) {
        numeroIscritti += numero;
    }

    public void rimuoviIscritti(int numero) {
        numeroIscritti -= numero;
    }
}