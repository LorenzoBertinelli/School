package ScuolaPag189;

public class Scuola {
    private Dipendente[] dipendenti;
    private int numeroDipendenti;

    public Scuola(int capacita) {
        dipendenti = new Dipendente[capacita];
        numeroDipendenti = 0;
    }

    public void aggiungiDipendente(Dipendente dipendente) {
        if (numeroDipendenti < dipendenti.length) {
            dipendenti[numeroDipendenti] = dipendente;
            numeroDipendenti++;
        } else {
            System.out.println("Capacità massima raggiunta.");
        }
    }

    public void stampaDipendenti() {
        for (int i = 0; i < numeroDipendenti; i++) {
            Dipendente d = dipendenti[i];
            System.out.println("Nominativo: " + d.getNominativo() + ", Genere: " + d.getGenere() + ", Indirizzo: " + d.getIndirizzo());
        }
    }

    public Dipendente cercaDipendente(String nominativo) {
        for (int i = 0; i < numeroDipendenti; i++) {
            Dipendente d = dipendenti[i];
            if (d.getNominativo().equalsIgnoreCase(nominativo)) {
                return d;
            }
        }
        return null;
    }

    public int contaDipendentiPerGenere(char genere) {
        int count = 0;
        for (int i = 0; i < numeroDipendenti; i++) {
            Dipendente d = dipendenti[i];
            if (d.getGenere() == genere) {
                count++;
            }
        }
        return count;
    }
}