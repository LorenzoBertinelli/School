package SocietàServiziPag231_Es27;

import java.time.LocalDate;

public class Contatore {
    protected String matricola;
    protected LocalDate dataInstallazione;
    protected LocalDate ultimaLettura;

    public Contatore(String matricola, LocalDate dataInstallazione) {
        this.matricola = matricola;
        this.dataInstallazione = dataInstallazione;
        this.ultimaLettura = null; // Imposta a null inizialmente
    }

    public void registraLettura(LocalDate lettura) {
        this.ultimaLettura = lettura;
    }

    public String getMatricola() {
        return matricola;
    }

    public LocalDate getUltimaLettura() {
        return ultimaLettura;
    }

    public LocalDate getDataInstallazione() {
        return dataInstallazione;
    }
}