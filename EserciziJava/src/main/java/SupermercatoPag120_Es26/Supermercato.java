package SupermercatoPag120_Es26;


public class Supermercato {
    Prodotto[] prodotti;
    int numeroProdotti;

    public Supermercato(int capacita) {
        prodotti = new Prodotto[capacita];
        numeroProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (numeroProdotti < prodotti.length) {
            prodotti[numeroProdotti] = prodotto;
            numeroProdotti++;
        }
    }

    public void rifornimento(String codice, int quantita) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                prodotti[i].rifornimento(quantita);
                return;
            }
        }
    }

    public void vendita(String codice, int quantita) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                if (prodotti[i].vendita(quantita)) {
                    return;
                }
            }
        }
    }

    public void trasferimento(String codice, int quantita) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                if (prodotti[i].trasferimento(quantita)) {
                    return;
                }
            }
        }
    }

    public void elencoScorteInferiori(int soglia) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].scortaTotale() < soglia) {
                System.out.println(prodotti[i].dettagli());
            }
        }
    }

    public void mostraMagazzino(String codice) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                System.out.println(prodotti[i].dettagli());
                return;
            }
        }
    }
}