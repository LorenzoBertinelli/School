**********************************
primo esempio puntatori e stringhe
*******************************************************************************/
#include <stdio.h>
int main() {
    //                E,s,e,m,p,i,o,/0
    char stringa[] = "Esempio";  // Dichiarazione e inizializzazione di una stringa
    char str2 [] = {'E','s','s','e','\0'};
    printf("%c\n", stringa[6]);
 
    char *puntatore = stringa;   // Dichiarazione di un puntatore a carattere
    printf("Stringa: %s\n", stringa);
    printf("Puntatore: %s\n", puntatore);
    // Modifica della stringa attraverso il puntatore
    *puntatore = 'I';
    printf("Stringa modificata: %s\n", stringa);
    
    
    while(*puntatore != '\0'){
        printf("%c-", *puntatore);
        puntatore++;
        *p
    }
    
    // Avanzamento del puntatore per visualizzare il resto della stringa
    puntatore++;
    printf("Resto della stringa: %s\n", puntatore);
return 0;
}

******************************************************************************
Passaggio_indirizzo
*******************************************************************************/
#include <stdio.h>
/*
In questo esempio, la funzione swap riceve in input due puntatori 
a interi (int *a e int *b) e utilizza l'operatore di 
dereferenziazione (*) per accedere al contenuto delle variabili 
puntate e scambiarlo. La funzione swap viene chiamata dalla 
funzione main passando gli indirizzi delle variabili x e y 
tramite gli operatori di indirizzamento (&).
*/
void swap(int *a, int *b);  // dichiarazione della funzione swap per indirizzo
int main() {
    
    int x = 10, y = 20;
    
    printf("Prima dello scambio: x = %d, y = %d\n", x, y);
    
    swap(&x, &y);  // passaggio degli indirizzi delle variabili x e y alla funzione swap
    
    printf("Dopo lo scambio: x = %d, y = %d\n", x, y);
   
    swap(&x, &y);  // passaggio degli indirizzi delle variabili x e y alla funzione swap
    
    printf("Dopo lo scambio: x = %d, y = %d\n", x, y);
    
    return 0;
}
// definizione della funzione swap per indirizzo
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

/******************************************************************************
Programma che attraverso una funzione data una stringa
presa in input e passata per riferimento ad una funzione, 
copia in una seconda stringa solo i caratteri minuscoli.
*******************************************************************************/
#include <stdio.h>
#include <string.h>
void copiaStringhe(char *s1, char *s2){
    
    int i=0,j=0;
    
    while(s1[i] != '\0' ){
        if(s1[i] >= 'a' && s1[i] <= 'z'){
            s2[j] = s1[i];
            j++;
        }
        i++;
    }
    
}
int main()
{
    int dim = 10;
    char s1[dim], s2[dim];
    
    printf("Inserisci stringa: ");
    scanf("%s", s1);
    copiaStringhe(s1, s2);
    printf("Ecco la stringa di sole miniscole: %s", s2);
    
    return 0;
}

strcpy: Copia la stringa s2 nella stringa s1; restituisce 
un puntatore alla stringa s1. 
strncpy: Copia al massimo i primi n caratteri della stringa 
s2 nella stringa s1; restituisce un puntatore alla stringa s1.
*******************************************************************************/
#include <stdio.h>
#include <string.h>
int main()
{
    int dim = 100;
    char s1[dim], s2[dim];
    
    printf("Inserisci la stringa da copiare in s1, quindi la s2: ");
    scanf("%s", s2);
    printf("inserito s2: %s\n", s2);
    
    strcpy(s1,s2);
    
    printf("\nStringa copiata in s1: %s\n", s1);
    
    char s3[dim];
    strncpy(s3, s2, 3);
    printf("\ncaratteri copiati in s3: %s\n", s3);
    return 0;
}

/******************************************************************************
strcpm: 
Confronta le stringhe s1 ed s2 restituendo: un valore negativo se s1 precede 
in ordine lessicografico s2, il valore 0 se s1 ed s2 sono uguali, 
un valore positivo se s1 segue in ordine lessicografico s2.
strncmp:
Confronta al massimo i primi n caratteri delle stringhe s1 ed s2 restituendo: 
un valore negativo se s1 precede in ordine lessicografico s2, 
il valore 0 se s1 ed s2 sono uguali, un valore positivo se s1 
segue in ordine lessicografico s2.
*******************************************************************************/
#include <stdio.h>
#include <string.h>
/*
void my_strcmp(char *s1, char *s2){
    
    int i=0;
    for( ; i< strlen(s1); i++){
        if(s1[i] < s2[i]){
            
        }
        
    }
}
*/
int main()
{
    int dim = 100;
    char s1[dim], s2[dim];
    
    printf("Inserisci la prima stringa: ");
    scanf("%s", s1);
    printf("inserito s1: %s\n", s1);
    
    printf("Inserisci la seconda stringa: ");
    scanf("%s", s2);
    printf("inserito s2: %s\n", s2);
    
    // strcmp()
    printf("esito: %d\n",strcmp(s1, s2));
    
    // strncmp()  
    if(strncmp(s1, s2, 2) == 0)
        printf("primi n caratteri uguali !");
    else 
        printf("primi n caratteri diversi !");
        
    
    //printf("esito: %d\n",my_strcmp(s1, s2));
  
        
    return 0;
}

/******************************************************************************
CONCATENAZIONE DI STRINGHE
strcat: Appende una copia della stringa s2 
alla stringa s1; 
restituisce un puntatore alla stringa s1.
strncat: Appende al massimo i primi n 
caratteri copiati dalla stringa s2 alla stringa s1; 
restituisce un puntatore alla stringa s1.
*******************************************************************************/
#include <stdio.h>
#include <string.h>
int main()
{
    int dim = 100;
    char s1[dim], s2[dim];
    
    printf("Inserisci la prima stringa: ");
    scanf("%s", s1);
    printf("inserito s1: %s\n", s1);
    
    printf("Inserisci la seconda stringa: ");
    scanf("%s", s2);
    printf("inserito s2: %s\n", s2);
    
    strcat(s1, " ");
    strcat(s1,s2);
    
    printf("Stringa s1 concatenata con s2: %s\n", s1);
    char s3[dim];
    printf("Inserisci la terza stringa: ");
    scanf("%s", s3);
    printf("inserito s3: %s\n", s3);
    
    strcat(s1, " ");
    
    strncat(s1,s3,3);
    
    printf("Stringa s1 concatenata con s2 + s3: %s\n", s1);
    
    return 0;
}