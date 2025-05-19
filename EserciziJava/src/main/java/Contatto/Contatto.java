package Contatto;

public class Contatto {
    private String nome;
    private String cognome;
    private int eta;

    public Contatto(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        nome = this.nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String toString() {
        return nome + " " + cognome + ", " + eta + " anni";
    }
}