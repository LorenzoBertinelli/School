package Esercizio1Verifica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class GestioneContatori {
    private Contatore[] contatori;
    private int index;

    public GestioneContatori(int size) {
        contatori = new Contatore[size];
        index = 0;
    }

    public void aggiungiContatore(Contatore contatore) {
        if (index < contatori.length) {
            contatori[index++] = contatore;
        } else {
            System.out.println("Capacità massima raggiunta.");
        }
    }

    public double calcolaImportoTotale() {
        double totale = 0;
        for (int i = 0; i < index; i++) {
            totale += contatori[i].calcolaImporto();
        }
        return totale;
    }

    public void salvaDati(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < index; i++) {
                writer.write(String.format("%s, %s, %s, %.2f%n",
                        contatori[i].matricola,
                        contatori[i].data,
                        contatori[i].ora,
                        contatori[i].calcolaImporto()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}