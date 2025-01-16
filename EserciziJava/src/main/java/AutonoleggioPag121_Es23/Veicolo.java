package AutonoleggioPag121_Es23;

public class Veicolo {
    private int codice; // Codice univoco del veicolo
    private String targa; // Targa del veicolo
    private String marca; // Marca del veicolo
    private String modello; // Modello del veicolo
    private int numeroPosti; // Numero di posti a sedere

    // Costruttore per inizializzare un veicolo
    public Veicolo(int codice, String targa, String marca, String modello, int numeroPosti) {
        this.codice = codice;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }

    // Getters per accedere ai dati del veicolo
    public int getCodice() {
        return codice;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    // Override del metodo toString per una rappresentazione leggibile del veicolo
    @Override
    public String toString() {
        return "Veicolo{" +
                "codice=" + codice +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numeroPosti=" + numeroPosti +
                '}';
    }
}