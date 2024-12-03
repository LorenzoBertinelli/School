#include <iostream>
#include <math.h>
using namespace std;

float somma(float numeri[], int dim){
    int somma=0;
    for(int i=0; i<dim; i++){
        somma=somma+numeri[i];
    }
    return somma;
}
float media(float numeri[], int dim){
    return somma(numeri,dim)/dim;
}
float varianza(float numeri[], int dim){
    return pow(somma(numeri,dim),2)/dim-pow(media(numeri,dim),2);
}

int main(){
    int n;
    cout<<"quanto vuoi grande l'array?";
    cin>>n;
    float numeri[n];

    for(int i=0; i<n; i++){
        cout<<"inserisci un numero: ";
        cin>>numeri[i];
    }

    cout<<"la media e': "<< media(numeri,n)<<endl;
    cout<<"la varianza e': "<<varianza(numeri,n)<<endl;
    return 0;
}