package ChiaviAlbergoPag120_Es20;


public class Portachiavi {
    private static class Chiave {
        private int numeroCamera;
        private String nominativoCliente;

        public Chiave(int numeroCamera, String nominativoCliente) {
            this.numeroCamera = numeroCamera;
            this.nominativoCliente = nominativoCliente;
        }

        public int getNumeroCamera() {
            return numeroCamera;
        }

        public String getNominativoCliente() {
            return nominativoCliente;
        }

        @Override
        public String toString() {
            return "Camera " + numeroCamera + ", Cliente: " + nominativoCliente;
        }
    }

    private Chiave[] chiavi;
    private int dimensione;

    public Portachiavi(int capacita) {
        chiavi = new Chiave[capacita];
        dimensione = 0;
    }

    // Aggiunge una chiave nella prima posizione libera
    public void lasciaChiave(int numeroCamera, String nominativoCliente) {
        if (dimensione >= chiavi.length) {
            System.out.println("Portachiavi pieno, impossibile aggiungere la chiave per la camera " + numeroCamera);
            return;
        }

        // Trova la prima posizione libera
        for (int i = 0; i < chiavi.length; i++) {
            if (chiavi[i] == null) {
                chiavi[i] = new Chiave(numeroCamera, nominativoCliente);
                dimensione++;
                System.out.println("Chiave aggiunta: " + chiavi[i]);
                return;
            }
        }
    }

    // Cerca e rimuove una chiave in base al numero della camera
    public Chiave prendiChiave(int numeroCamera) {
        for (int i = 0; i < chiavi.length; i++) {
            if (chiavi[i] != null && chiavi[i].getNumeroCamera() == numeroCamera) {
                Chiave chiave = chiavi[i];
                chiavi[i] = null;
                dimensione--;
                System.out.println("Chiave ritirata: " + chiave);
                return chiave;
            }
        }
        System.out.println("Chiave non trovata per la camera: " + numeroCamera);
        return null;
    }

    // Cerca e rimuove una chiave in base al nominativo del cliente
    public Chiave prendiChiave(String nominativoCliente) {
        for (int i = 0; i < chiavi.length; i++) {
            if (chiavi[i] != null && chiavi[i].getNominativoCliente().equalsIgnoreCase(nominativoCliente)) {
                Chiave chiave = chiavi[i];
                chiavi[i] = null;
                dimensione--;
                System.out.println("Chiave ritirata: " + chiave);
                return chiave;
            }
        }
        System.out.println("Chiave non trovata per il cliente: " + nominativoCliente);
        return null;
    }

    // Stampa tutte le chiavi presenti nel portachiavi
    public void visualizzaChiavi() {
        System.out.println("Chiavi presenti nel portachiavi:");
        for (Chiave chiave : chiavi) {
            if (chiave != null) {
                System.out.println(chiave);
            }
        }
    }
}