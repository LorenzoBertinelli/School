#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
    int n=200;
    int numeri_casuali[n];
    srand(time(NULL));

    for(int i=0; i<n;i++){
        numeri_casuali[i]=rand()%100+1;
        printf("numero generato: \n" "%d\n",numeri_casuali[i]);
    }
    return 0;
}