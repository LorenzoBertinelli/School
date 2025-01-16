package Automobile;
public class Auto {
    private String codice;
    private String marca;
    private boolean noleggio;
    private int giorni;

    private static double costoBase = 50.0;
    private static double costoGiornoSupplementare = 35.0;

    public Auto(String codice, String marca, boolean noleggio, int giorni) {
        this.codice = codice;
        this.marca = marca;
        setNoleggio(noleggio);
        setGiorni(giorni);
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isNoleggio() {
        return noleggio;
    }

    public void setNoleggio(boolean noleggio) {
        this.noleggio = noleggio;
    }

    public int getGiorni() {
        return giorni;
    }

    public void setGiorni(int giorni) {
        if (giorni < 0 || giorni > 30) {
            throw new IllegalArgumentException("I giorni devono essere compresi tra 0 e 30.");
        }
        this.giorni = giorni;
    }

    public static void setCostoBase(double costo) {
        costoBase = costo;
    }

    public static void setCostoGiornoSupplementare(double costo) {
        costoGiornoSupplementare = costo;
    }

    public double calcolaCostoNoleggio() {
        if (!noleggio) {
            return 0.0;
        }
        return costoBase + (giorni > 1 ? (giorni - 1) * costoGiornoSupplementare : 0);
    }

    @Override
    public String toString() {
        String info = "Codice: " + codice + ", Marca: " + marca + ", Noleggiata: " + (noleggio ? "Sì" : "No") + ", Giorni: " + giorni;
        if (noleggio) {
            info += ", Costo Noleggio: " + calcolaCostoNoleggio() + " Euro";
        }
        return info;
    }
}