#include <iostream>

using namespace std;

int valore_prossimo (double numero ){
    return numero+1;
}

int main(){
    double numero;

    cout<<"Ciao, benvenuto in questo programma che calcola il valore prossimo intero del numero digitato"<<endl;
    cout<<"Inserisci il valore: "<<endl;
    cin>>numero;
    
    cout<<"il valore prossimo di "<<numero<<" e': "<<valore_prossimo(numero);

    return 0;
}