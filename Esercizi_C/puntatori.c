#include <stdio.h>
#include <stdlib.h>

/*il puntatore è una variabile, invece che un  valore contiene un indirizzo di memoria, */

/******************************************************************************
Primi passi con i puntatori
*******************************************************************************/

int main()
{

    char c='A';//inizializzo in memoria un carattere

    
    //SINTASSI DEI PUNTATORI
    //inizializzo in memoria una cella pC che contiene
    //l'indirizzo della cella in cui è contenuto il 
    //valore della variabile c a riga 9
    char *pC = &c;//ma cosa ti ricorda &c? dov'è che hai gia visto &?
    //scanf("%c",&c)


    //la stessa cosa la facciamo con ad esempoio un int
    int i=5;
    int* pI = &i;//questa azione si chiama referenziazione (riferirsi a...)
    // & si chiama operatore di referenziazione
    
    /*
    ATTENZIONE:
    i: ha il suo indirizzo es. 0x1234 e contiene al suo interno il valore 5
  *pI: ha il suo indirizzo es. 0x9874 e contiene al suo interno l'indirizzo di i 0x1234
    
    */
    //stampiamo le dimensioni di tipi primitivi e puntatori a tipi primitivi
    printf("Char: %lu byte - int: %lu byte\n", sizeof(char), sizeof(int));
    printf("Puntatore a char %lu byte - puntatore a int %lu byte\n", sizeof(char*), sizeof(int*));
    //lo spazio occupato da un puntatore è indifferente dal tipo di dato puntato
    
    printf("------------\n");
    
    //Ma come si stampano i valori e gli indirizzi? int* pI = &i;
    printf("pI come un intero, indirizzo in decimale: %d\n", pI);// genera un warning! Ma stampa l'indirizzo in decimale
    
    // %p è l'identificatore dedicato alla stampa in esadecimale dei puntatori
    printf("pI come puntatore: %p valore all'interno\n", pI);
    
    /*
    Se voglio stampare il valore all'interno della cella puntata
    da pI?
    - uso %d perché so che dentro c'è un un int
    - uso *pI per stampare il valore * è detto operatore di deferenziazione
    */
    printf("valore all'interno della cella puntata da pI: %d\n", *pI);
    
    printf("------------\n");
    
    // se voglio stampare l'indirizzo di i
    printf("indirizzo di i: %p in esadecimale\n", &i);
    
    //e se voglio modificare la variabile i tramite il suo puntatore?
    printf("valore di i prima della modifica: %d\n",i);
    
    *pI = 8;//modifica il valore della variabile puntata da *pI
    printf("valore di i modificata tramite il suo puntatore: %d",i);
    

    return 0;
}