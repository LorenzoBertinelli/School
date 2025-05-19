package SocietàServiziPag231_Es27;

import java.time.LocalDate;

public class ContatoreAcqua extends Contatore {
    private LocalDate letturaPrecedente;

    public ContatoreAcqua(String matricola, LocalDate dataInstallazione) {
        super(matricola, dataInstallazione);
        this.letturaPrecedente = null; // Imposta a null inizialmente
    }

    @Override
    public void registraLettura(LocalDate lettura) {
        letturaPrecedente = ultimaLettura;
        super.registraLettura(lettura);
    }

    public int calcolaConsumo() {
        if (ultimaLettura != null && letturaPrecedente != null) {
            return (int) (ultimaLettura.toEpochDay() - letturaPrecedente.toEpochDay());
        }
        return 0;
    }
}