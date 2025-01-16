/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package televisione;

import java.util.Scanner;

class Televisione {
    private String nome;
    private int pollici;
    private String risoluzione;
    private StatoTV stato;
    private int volume;
    private int canale;

    // Costruttore
    public Televisione(String nome, int pollici, String risoluzione, StatoTV stato, int volume, int canale) {
        this.nome = nome;
        this.pollici = pollici;
        this.risoluzione = risoluzione;
        this.stato = stato;
        this.volume = volume;
        this.canale = canale;
    }

    // Getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }

    public StatoTV getStato() {
        return stato;
    }

    public void setStato(StatoTV stato) {
        this.stato = stato;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanale() {
        return canale;
    }

    public void setCanale(int canale) {
        this.canale = canale;
    }

    // Metodo per accendere la TV
    public void accensione() {
        if (stato == StatoTV.Spento) {
            stato = StatoTV.Acceso;
            System.out.println("La televisione è stata accesa.");
        } else {
            System.out.println("La televisione è già accesa o in standby.");
        }
    }

    // Metodo per spegnere la TV
    public void spegnimento() {
        if (stato == StatoTV.Acceso || stato == StatoTV.StandBy) {
            stato = StatoTV.Spento;
            System.out.println("La televisione è stata spenta.");
        } else {
            System.out.println("La televisione è già spenta.");
        }
    }

    // Metodo per cambiare il canale
    public void cambiaCanale(int nuovoCanale) {
        if (stato == StatoTV.Acceso) {
            this.canale = nuovoCanale;
            System.out.println("Il canale è stato impostato a " + nuovoCanale);
        } else {
            System.out.println("La televisione non è accesa. Accendila prima di cambiare canale.");
        }
    }

    // Metodo per modificare il volume
    public void modificaVolume(int nuovoVolume) {
        if (stato == StatoTV.Acceso) {
            this.volume = nuovoVolume;
            System.out.println("Il volume è stato impostato a " + nuovoVolume);
        } else {
            System.out.println("La televisione non è accesa. Accendila prima di modificare il volume.");
        }
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Televisione [Nome=" + nome + ", Pollici=" + pollici + ", Risoluzione=" + risoluzione +
                ", Stato=" + stato + ", Volume=" + volume + ", Canale=" + canale + "]";
    }

    // Metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Televisione that = (Televisione) obj;
        return pollici == that.pollici &&
               volume == that.volume &&
               canale == that.canale &&
               stato == that.stato &&
               nome.equals(that.nome) &&
               risoluzione.equals(that.risoluzione);
    }
}
