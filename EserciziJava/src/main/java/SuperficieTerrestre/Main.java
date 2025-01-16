package SuperficieTerrestre;

/**
 *
 * @author Lorenzo
 */
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Creazione di una posizione utilizzando la rappresentazione decimale
        PosizioneSuperficieTerrestre posizione1 = new PosizioneSuperficieTerrestre(45.123, 12.345, LocalDateTime.now());
        System.out.println("Posizione 1 - Latitudine decimale: " + posizione1.getLatitudineDecimale());
        System.out.println("Posizione 1 - Longitudine decimale: " + posizione1.getLongitudineDecimale());
        System.out.println("Posizione 1 - Data/Ora di rilevazione: " + posizione1.getDataOraRilevazione());

        // Creazione di una posizione utilizzando gradi, primi e secondi
        PosizioneSuperficieTerrestre posizione2 = new PosizioneSuperficieTerrestre(40, 30, 15.5, 'N', 74, 0, 25.3, 'W', LocalDateTime.now());
        System.out.println("Posizione 2 - Latitudine decimale: " + posizione2.getLatitudineDecimale());
        System.out.println("Posizione 2 - Longitudine decimale: " + posizione2.getLongitudineDecimale());
        System.out.println("Posizione 2 - Data/Ora di rilevazione: " + posizione2.getDataOraRilevazione());
    }
}
