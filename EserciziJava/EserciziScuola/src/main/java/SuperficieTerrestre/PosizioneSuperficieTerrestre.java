/*
 Una posizione sulla superficie terrestre è caratterizzata dalla latitudine (Nord o Sud, è un angolo compreso tra 0 e 90 gradi, 
normalmente espresso in gradi, primi e secondi) 
e dalla longitudine (Est o Ovest, è un angolo compreso tra 0 e 180 gradi, normalmente espresso in gradi, primi e secondi), 
ma può essere rappresentata anche da valori non interi dei due angoli compresi per la latitudine tra -90 e +90 gradi 
(i valori negativi sono per le latitudini Sud, quelli positivi per le latitudini Nord) e per la longitudine tra - 180 e + 180 
(i valori negativi sono per le longitudini
Ovest, quelli positivi per le longitudini Est).
Realizzare una classe Java che consenta di rappresentare una posizione sulla superficie terrestre utilizzando indifferentemente uno o 
l'altra delle due possibili rap-presentazioni; la classe deve consentire di registrare la data/ora di rilevazione della posizione.
 */
package SuperficieTerrestre;

import java.time.LocalDateTime;

public class PosizioneSuperficieTerrestre {
    private double latitudineDecimale; // Valori tra -90 e +90 (negativi per Sud, positivi per Nord)
    private double longitudineDecimale; // Valori tra -180 e +180 (negativi per Ovest, positivi per Est)
    private LocalDateTime dataOraRilevazione;

    // Costruttore che utilizza i valori decimali
    public PosizioneSuperficieTerrestre(double latitudineDecimale, double longitudineDecimale, LocalDateTime dataOraRilevazione) {
        setLatitudineDecimale(latitudineDecimale);
        setLongitudineDecimale(longitudineDecimale);
        this.dataOraRilevazione = dataOraRilevazione;
    }

    // Costruttore che utilizza gradi, primi, secondi per latitudine e longitudine
    public PosizioneSuperficieTerrestre(int gradiLat, int primiLat, double secondiLat, char direzioneLat,
                                        int gradiLon, int primiLon, double secondiLon, char direzioneLon,
                                        LocalDateTime dataOraRilevazione) {
        setLatitudine(gradiLat, primiLat, secondiLat, direzioneLat);
        setLongitudine(gradiLon, primiLon, secondiLon, direzioneLon);
        this.dataOraRilevazione = dataOraRilevazione;
    }

    // Getter e Setter per latitudine decimale
    public double getLatitudineDecimale() {
        return latitudineDecimale;
    }

    public void setLatitudineDecimale(double latitudineDecimale) {
        if (latitudineDecimale < -90 || latitudineDecimale > 90) {
            throw new IllegalArgumentException("La latitudine deve essere compresa tra -90 e 90 gradi.");
        }
        this.latitudineDecimale = latitudineDecimale;
    }

    // Getter e Setter per longitudine decimale
    public double getLongitudineDecimale() {
        return longitudineDecimale;
    }

    public void setLongitudineDecimale(double longitudineDecimale) {
        if (longitudineDecimale < -180 || longitudineDecimale > 180) {
            throw new IllegalArgumentException("La longitudine deve essere compresa tra -180 e 180 gradi.");
        }
        this.longitudineDecimale = longitudineDecimale;
    }

    // Getter e Setter per data e ora di rilevazione
    public LocalDateTime getDataOraRilevazione() {
        return dataOraRilevazione;
    }

    public void setDataOraRilevazione(LocalDateTime dataOraRilevazione) {
        this.dataOraRilevazione = dataOraRilevazione;
    }

    // Metodi per impostare latitudine e longitudine con gradi, primi e secondi
    public void setLatitudine(int gradi, int primi, double secondi, char direzione) {
        double valoreDecimale = gradi + primi / 60.0 + secondi / 3600.0;
        if (direzione == 'S' || direzione == 's') {
            valoreDecimale = -valoreDecimale;
        }
        setLatitudineDecimale(valoreDecimale);
    }

    public void setLongitudine(int gradi, int primi, double secondi, char direzione) {
        double valoreDecimale = gradi + primi / 60.0 + secondi / 3600.0;
        if (direzione == 'W' || direzione == 'w') {
            valoreDecimale = -valoreDecimale;
        }
        setLongitudineDecimale(valoreDecimale);
    }
}

