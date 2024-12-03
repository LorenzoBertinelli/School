#include <iostream>
#include <ctime>
using namespace std;
void stampa(int v[], int n){
    for(int i=0; i<n; i++){
        cout<<v[i]<<" ";
    }

    cout<<endl;
}

int somma(int v1[], int v2[], int n){
    int v3[2*n];
    for(int i=0; i<n; i++){
        v3[i]=v1[i];
        i++;
        v3[i]=v2[i];
    }

    int somma=0;
    for(int i=0; i<2*n; i++){
        somma=somma+v3[i];
    }
    
    stampa(v3,2*n);
    return somma;
}


int main(){

    int n=10;
    int v1[n];
    int v2[n];

    srand(time(NULL));

    for(int i=0; i<n; i++){
        v1[i]= rand()%20+1; 
        v2[i]= rand()%20+1; 
    }

    stampa(v1,n);
    stampa(v2,n);
    cout<<"la somma e': "<<somma(v1,v2,n);
    

    return 0;
}