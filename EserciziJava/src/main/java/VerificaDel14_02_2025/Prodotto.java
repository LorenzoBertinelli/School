package VerificaDel14_02_2025;

public class Prodotto {
    private String codice;
    private String descrizione;
    private int quantitaMassima;
    private double costoUnitario;
    private int quantitaPresente;

    public Prodotto(String codice, String descrizione, int quantitaMassima, double costoUnitario, int quantitaPresente) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.quantitaMassima = quantitaMassima;
        this.costoUnitario = costoUnitario;
        this.quantitaPresente = quantitaPresente;
    }

    // Metodo per calcolare il costo totale del prodotto
    public double calcolaCostoTotale() {
        return costoUnitario * quantitaPresente;
    }

    // Metodo per verificare se la quantità è al di sotto di una soglia minima
    public boolean verificaSogliaMinima(int sogliaMinima) {
        return quantitaPresente < sogliaMinima;
    }

    // Metodo per rifornire il prodotto
    public boolean rifornisci(int quantità) {
        if (quantitaPresente + quantità <= quantitaMassima) {
            quantitaPresente += quantità;
            return true;
        } else {
            return false; // Non si può rifornire oltre la quantità massima
        }
    }

    // Metodo per stampare le informazioni del prodotto
    public void stampaInformazioni() {
        System.out.println("Codice: " + codice);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Quantità Massima: " + quantitaMassima);
        System.out.println("Costo Unitario: " + costoUnitario);
        System.out.println("Quantità Presente: " + quantitaPresente);
        System.out.println("Costo Totale: " + calcolaCostoTotale());
    }

    public String getCodice() {
        return codice;
    }

    public int getQuantitaPresente() {
        return quantitaPresente;
    }
}