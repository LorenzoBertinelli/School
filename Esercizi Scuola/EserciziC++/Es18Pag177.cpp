#include <iostream>
using namespace std;

float differenzatraMinEMax(float numeri[], int dim){
    float max=numeri[0];
    float min=numeri[0];
    for(int i=0; i<dim; i++){
        if(numeri[i]>max){
            max=numeri[i];
        }
        if(numeri[i]<min){
            min=numeri[i];
        }
        
    }
    return max-min;
}
int main(){
    int n;
    cout<<"inserisci la dimensione dell'array: ";
    cin>>n;
    float numeri[n];
    for(int i=0; i<n; i++){
        cout<<"inserisci un numero: ";
        cin>>numeri[i];
    }

    cout<<"differenza tra il valore minimo e il valore massimo: "<<differenzatraMinEMax(numeri,n);
    
    return 0;
}