package SupermercatoPag120_Es26;

public class Main {
    public static void main(String[] args) {
        Supermercato supermercato = new Supermercato(10);
        
        // Aggiungi prodotti
        supermercato.aggiungiProdotto(new Prodotto("001", "Latte", 1.50, 20, 100));
        supermercato.aggiungiProdotto(new Prodotto("002", "Pane", 0.80, 15, 50));
        
        // Esempi di operazioni
        supermercato.rifornimento("001", 10);
        supermercato.vendita("002", 5);
        supermercato.trasferimento("001", 5);
        supermercato.elencoScorteInferiori(30);
        supermercato.mostraMagazzino("001");
    }
}