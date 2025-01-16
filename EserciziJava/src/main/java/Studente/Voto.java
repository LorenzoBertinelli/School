package Studente;

import java.time.LocalDate;

public class Voto {
    private double voto;
    private char tipologia; // 'O' per Orale, 'S' per Scritta, 'P' per Pratica
    private LocalDate data;
    private String note;

    public Voto(double voto, char tipologia, LocalDate data, String note) {
        this.voto = voto;
        this.tipologia = tipologia;
        this.data = data;
        this.note = note;
    }

    public double getVoto() {
        return voto;
    }

    public char getTipologia() {
        return tipologia;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNote() {
        return note;
    }
}