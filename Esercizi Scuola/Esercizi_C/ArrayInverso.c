#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//vedere il codice pubblicagto sul teams del corso
int main(){
    int n=256;
    int array[n], array_1[n];

    srand(time(NULL));
    //inizializzo l'array
    for(int i=0; i<n; i++){
        array[i]= rand()%50;
        printf("%d",array[i]);
    }
    for(int i=0; i>=0; i--){
        array_1[i]= array
        printf("%d",array_1[i]);
    }
    for(int i=0; i<n; i--){
        printf("%d",array_1[i]);
    }
    return 0;
}