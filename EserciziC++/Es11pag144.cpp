#include <iostream>

using namespace std;

float velocita (float diametro, float giri){

    double risultato = 3.1416 * diametro * giri * 6;
    risultato=risultato*60/1000;    //faccio la conversione da m/s a km/h
    return risultato;
}

int main(){
    
    float diametro, giri;
    cout<<"inserici il diametro (numero maggiore di 0): "<<endl;
    cin>>diametro;
    cout<<"inserici i giri fatti in 10 secondi: "<<endl;
    cin>>giri;

    //modo 1
    double ris=velocita(diametro, giri);
    cout<<"la bicicletta va a: "<<ris<<"km/h"<<endl;

    //modo 2
    cout<<"la bicicletta va a: "<<velocita(diametro,giri)<<" km/h"<<endl;

    return 0;

}