//somma media di un array
#include <stdio.h>
#include <stdlib.h>


int main(){
    int n=5;
    double numeri[n];
    double somma=0, media=0;

    for(int i=0; i<5; i++){
        printf("inserisci il numero: ");
        scanf("%lf",&numeri[i]);
        printf("valore inserito: %.2f \n", numeri[i]);
        somma=somma+numeri[i];
        printf("somma attuale: %.2f \n", somma);
    }
    media=somma/n;
    printf("la media e': %.2f",media);
    
    return 0;
}