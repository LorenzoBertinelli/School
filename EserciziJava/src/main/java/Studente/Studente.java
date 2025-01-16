package Studente;

import java.time.LocalDate;

public class Studente {
    private String nome;
    private Voto[] voti;
    private int count; // Contatore per il numero di voti

    public Studente(String nome, int maxVoti) {
        this.nome = nome;
        this.voti = new Voto[maxVoti];
        this.count = 0;
    }

    public void aggiungiVoto(Voto voto) {
        if (count < voti.length) {
            voti[count++] = voto;
        } else {
            System.out.println("Limite massimo di voti raggiunto.");
        }
    }

    public void eliminaVoto(char tipologia, LocalDate data) {
        for (int i = 0; i < count; i++) {
            if (voti[i].getTipologia() == tipologia && voti[i].getData().isEqual(data)) {
                // Sposta gli elementi a sinistra per mantenere l'array compatto
                for (int j = i; j < count - 1; j++) {
                    voti[j] = voti[j + 1];
                }
                voti[--count] = null; // Rimuove l'ultimo elemento
                return;
            }
        }
    }

    public double calcolaMediaTipologia(char tipologia) {
        double somma = 0;
        int numeroVoti = 0;

        for (int i = 0; i < count; i++) {
            if (voti[i].getTipologia() == tipologia) {
                somma += voti[i].getVoto();
                numeroVoti++;
            }
        }
        return numeroVoti > 0 ? somma / numeroVoti : 0;
    }

    public double calcolaMediaTotale() {
        double somma = 0;

        for (int i = 0; i < count; i++) {
            somma += voti[i].getVoto();
        }
        return count > 0 ? somma / count : 0;
    }

    public Voto[] estraiVoti() {
        Voto[] votiAttuali = new Voto[count];
        System.arraycopy(voti, 0, votiAttuali, 0, count);
        return votiAttuali;
    }

    public Voto[] estraiVotiTipologia(char tipologia) {
        Voto[] votiTipologia = new Voto[count];
        int numeroVotiTipologia = 0;

        for (int i = 0; i < count; i++) {
            if (voti[i].getTipologia() == tipologia) {
                votiTipologia[numeroVotiTipologia++] = voti[i];
            }
        }

        Voto[] risultato = new Voto[numeroVotiTipologia];
        System.arraycopy(votiTipologia, 0, risultato, 0, numeroVotiTipologia);
        return risultato;
    }

    public String getNome() {
        return nome;
    }
}