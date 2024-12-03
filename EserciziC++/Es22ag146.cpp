#include <iostream>

using namespace std;

int MCD (int m, int n ){
    int resto;
    do{
        resto=m%n;
        if(resto==0){
            return n;
            m=n;
            n=resto;
        }
    }while(true);    //ciclo infinito
}

int mcm(int m, int n){
    int c=(m*n)/MCD(m,n);
    return c;
}

int main(){

    int m,n;

    cout<<"Ciao, benvenuto in questo programma che calcola l'MCD e l'mcm dei due numeri inseriti"<<endl;
    cout<<"Inserisci il primo valore: "<<endl;
    cin>>m;
    cout<<"Inserisci il secondo valore: "<<endl;
    cin>>n;

    cout<<"l'mcm e': "<<mcm(m,n)<<endl;
    cout<<"l'MCD e': "<<MCD(m,n)<<endl;

    return 0;
    
}