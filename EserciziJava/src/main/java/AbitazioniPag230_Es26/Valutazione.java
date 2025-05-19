package AbitazioniPag230_Es26;

import java.time.LocalDate;

public class Valutazione {
    private double voto;
    private char tipologia;
    private LocalDate data;
    private String note;

    // Costruttore
    public Valutazione(double voto, char tipologia, LocalDate data, String note) {
        this.voto = voto;
        this.tipologia = tipologia;
        this.data = data;
        this.note = note;
    }

    // Getter per voto
    public double getVoto() {
        return voto;
    }

    // Getter per tipologia
    public char getTipologia() {
        return tipologia;
    }

    // Getter per data
    public LocalDate getData() {
        return data;
    }

    // Getter per note
    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Valutazione{" +
                "voto=" + voto +
                ", tipologia=" + tipologia +
                ", data=" + data +
                ", note='" + note + '\'' +
                '}';
    }
}