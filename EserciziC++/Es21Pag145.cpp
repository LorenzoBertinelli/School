//svolgere un programma che, legga in input il numeratore e il divisore di una frazione, e la semplifichi 
#include <iostream>
#include <math.h>

using namespace std;

int  mck (int m, int n){
    int resto= m%n;
    m=n;
    n=resto;

    return n;
}

void scambio (int n1, int n2 ){
    int t;
    t=n1;
    n1=n2;
}

int main (){

    int M, N, mcd;
    cout<<"Ciao, benvenuto in questo programma che semplifica la frazione inserita"<<endl;
    cout<<"Inserisci il primo numero: "<<endl;
    cin>>M;
    cout<<"Inserisci il secondo numero: "<<endl;
    cin>>N;

    if(M<N){
        scambio(M,N);
    }

    mcd= mck (M,N);
    cout<<"Il massimo comun divisore tra "<<N<<" e "<<M<<"e' :"<<mcd<<endl;

    return 0; 
}
