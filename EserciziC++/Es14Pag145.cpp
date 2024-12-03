#include <iostream>
#include <math.h>

using namespace std;

float t_percepita( float t_reale, float vel_vento){
    //calcolo la temperatura percepita
    float t_percepita=33+(0.45+0.29*vel_vento-0.002*vel_vento)*(t_reale-33);

    return t_percepita;
}

int main(){

    float t_reale, vel_vento;

    cout<<"Caio, benvenuto in questo programma che calcola la temperatura percepita tramite una formula fisica"<<endl;
    cout<<"Per poter fare questo calcolo ho bisogno che inserisci la temperatura reale e la velocita' del vento"<<endl;
    cout<<"Inserisci la velocita' del vento: "<<endl;
    cin>>vel_vento;
    cout<<"Inserisci la temperatura reale: "<<endl;
    cin>>t_reale;


    cout<<"la temperatura percepita e' di: "<<t_percepita(t_reale, vel_vento)<<endl;

    
    return 0;
}