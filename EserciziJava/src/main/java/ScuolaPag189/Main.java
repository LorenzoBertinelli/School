package ScuolaPag189;

public class Main {
    public static void main(String[] args) {
        // Creazione della scuola con capacità di 10 dipendenti
        Scuola scuola = new Scuola(10);

        // Creazione di dipendenti
        Dipendente impiegato1 = new Impiegato("Mario Rossi", 'M', "Via Roma 1", "Amministrazione");
        Dipendente docente1 = new Docente("Anna Bianchi", 'F', "Via Milano 2", "Professore", "Matematica");

        // Aggiunta dei dipendenti alla scuola
        scuola.aggiungiDipendente(impiegato1);
        scuola.aggiungiDipendente(docente1);

        // Stampa delle informazioni sui dipendenti
        System.out.println("Elenco dei dipendenti:");
        scuola.stampaDipendenti();

        // Ricerca di un dipendente
        String nomeDaCercare = "Mario Rossi";
        Dipendente trovato = scuola.cercaDipendente(nomeDaCercare);
        if (trovato != null) {
            System.out.println("Dipendente trovato: " + trovato.getNominativo());
        } else {
            System.out.println("Dipendente non trovato.");
        }

        // Conteggio dei dipendenti di genere maschile
        int countMaschili = scuola.contaDipendentiPerGenere('M');
        System.out.println("Numero di dipendenti maschili: " + countMaschili);
    }
}