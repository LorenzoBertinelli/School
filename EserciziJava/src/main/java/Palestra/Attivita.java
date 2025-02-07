package Palestra;
public class Attivita {
    private String tipo;
    private boolean istruttore;
    private int maxIscritti;
    private int iscritti;

    public Attivita(String tipo, boolean istruttore, int maxIscritti) {
        this.tipo = tipo;
        this.istruttore = istruttore;
        this.maxIscritti = maxIscritti;
        this.iscritti = 0;
    }

    public int postiDisponibili() {
        return maxIscritti - iscritti;
    }

    public boolean iscrivi(int quante) {
        if (quante <= postiDisponibili()) {
            iscritti += quante;
            return true;
        }
        return false;
    }

    public boolean abbandona(int quante) {
        if (quante <= iscritti) {
            iscritti -= quante;
            return true;
        }
        return false;
    }

    public String dammiTipo() {
        return tipo;
    }

    public boolean prevedeIstruttore() {
        return istruttore;
    }
}