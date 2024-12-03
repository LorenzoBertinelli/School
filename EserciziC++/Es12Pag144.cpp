#include <iostream>
#include <math.h>

double lunghezza(double periodo){
    return 9.8*pow(periodo/6.2832,2) ;
}    //l=g*pow(p/6.2832,2)

using namespace std;

int main(){

    double periodo;

    cout<<"Caio, benvenuto in questo programma che calcola la lunghezza di un pendolo"<<endl;
    cout<<"Per poter fare questo calcolo ho bisogno che inserisci un dato da inserire nella formula"<<endl;
    cout<<"Inserisci il periodo del pendolo: "<<endl;
    cin>>periodo;
    
    cout<<"la lunghezza e': "<<lunghezza(periodo)<<endl;

    return 0;
}