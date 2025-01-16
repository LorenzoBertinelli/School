package Automobile;

import java.util.ArrayList;

public class Agenzia {
    private String nome;
    private String indirizzo;
    private Auto[] autoArray;
    private int numeroAuto;

    public Agenzia(String nome, String indirizzo, int capacita) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.autoArray = new Auto[capacita];
        this.numeroAuto = 0;
    }

    public void inserisciAuto(Auto auto) {
        if (numeroAuto < autoArray.length) {
            autoArray[numeroAuto++] = auto;
        } else {
            throw new IllegalArgumentException("Capacità massima dell'agenzia raggiunta.");
        }
    }

    public void stampaAutoNoleggiate() {
        int count = 0;
        double totale = 0.0;
        for (int i = 0; i < numeroAuto; i++) {
            if (autoArray[i].isNoleggio()) {
                count++;
                totale += autoArray[i].calcolaCostoNoleggio();
            }
        }
        System.out.println("Numero di auto noleggiate: " + count + ", Importo totale: " + totale + " Euro");
    }

    public void cercaAuto(String codice) {
        for (int i = 0; i < numeroAuto; i++) {
            if (autoArray[i].getCodice().equals(codice)) {
                System.out.println(autoArray[i]);
                return;
            }
        }
        System.out.println("Auto con codice " + codice + " non trovata.");
    }

    public void stampaAutoNonNoleggiate() {
        boolean trovata = false;
        for (int i = 0; i < numeroAuto; i++) {
            if (!autoArray[i].isNoleggio()) {
                System.out.println(autoArray[i]);
                trovata = true;
            }
        }
        if (!trovata) {
            System.out.println("Nessuna auto non noleggiata disponibile.");
        }
    }
}