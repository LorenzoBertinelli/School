package televisione;

public enum StatoTV {
    Spento,
    Acceso,
    StandBy;

    public static StatoTV getStatoFromInt(int stato) {
        switch(stato) {
            case 0:
                return Spento;
            case 1:
                return Acceso;
            case 2:
                return StandBy;
            default:
                throw new IllegalArgumentException("Stato non corretto!");
        }
    }
}
