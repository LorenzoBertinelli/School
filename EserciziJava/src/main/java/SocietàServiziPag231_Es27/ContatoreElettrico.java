package SocietàServiziPag231_Es27;

import java.time.LocalDate;

public class ContatoreElettrico extends Contatore {
    private int potenzaMassima;

    public ContatoreElettrico(String matricola, LocalDate dataInstallazione, int potenzaMassima) {
        super(matricola, dataInstallazione);
        this.potenzaMassima = potenzaMassima;
    }

    @Override
    public void registraLettura(LocalDate lettura) {
        super.registraLettura(lettura);
    }

    public int getPotenzaMassima() {
        return potenzaMassima;
    }
}