/*
Si realizzi un componente interfaccia Dispositivi che rappresenta la tipologia dei componenti elettronici.   

In tale interfaccia si definisce il metodo:   

public boolean uguale(Object X) che restituisce un booleano.  
 
Si realizzi poi una classe Smartphone che implementa l'interfaccia precedente. Ciascun Smartphone ha una marca(stringa), e un costo (double).   

Il metodo uguale restituisce vero se i due oggetti (X e quello su cui è invocato) hanno la stessa marca, falso altrimenti (usando il metodo equals).   

Si realizzi poi un metodo main in una classe Test che dichiari N oggetti e verifichi quali oggetti sono uguali invocando il metodo uguale e stampandone il costo.  

Salvare i dati in un file di testo.*/
package Esercizio2Verifica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione di 5 oggetti Smartphone
        Smartphone smartphone1 = new Smartphone("Apple", 999.99);
        Smartphone smartphone2 = new Smartphone("Samsung", 799.99);
        Smartphone smartphone3 = new Smartphone("Google", 699.99);
        Smartphone smartphone4 = new Smartphone("Apple", 1099.99);
        Smartphone smartphone5 = new Smartphone("Xiaomi", 499.99);
        
        // Array fisso di smartphone
        Smartphone[] smartphoneArray = new Smartphone[5];
        smartphoneArray[0] = smartphone1;
        smartphoneArray[1] = smartphone2;
        smartphoneArray[2] = smartphone3;
        smartphoneArray[3] = smartphone4;
        smartphoneArray[4] = smartphone5;

        // Verifica quali oggetti sono uguali e stampa il costo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("smartphone_dati.txt"))) {
            for (int i = 0; i < smartphoneArray.length; i++) {
                for (int j = i + 1; j < smartphoneArray.length; j++) {
                    if (smartphoneArray[i].uguale(smartphoneArray[j])) {
                        System.out.printf("Gli smartphone %s e %s sono uguali. Costo: €%.2f e €%.2f%n",
                                smartphoneArray[i].getMarca(),
                                smartphoneArray[j].getMarca(),
                                smartphoneArray[i].getCosto(),
                                smartphoneArray[j].getCosto());
                        
                        // Salva i dati nel file
                        writer.write(String.format("Gli smartphone %s e %s sono uguali. Costo: €%.2f e €%.2f%n",
                                smartphoneArray[i].getMarca(),
                                smartphoneArray[j].getMarca(),
                                smartphoneArray[i].getCosto(),
                                smartphoneArray[j].getCosto()));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}