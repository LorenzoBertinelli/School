/*pag a59 es 19*/ 
#include <iostream>
#include <cmath>
// dati input: temperatura reale, velocità del vento
// dati output: temperatura percepita
// vincoli di integrità: velocità <=0, temperatura -60<temperatura reale<+60
using namespace std;

int main(){

    float tr, v, tp;


    cout <<"inserisci velocita' del vento"<< endl;
    cin >>v;
    cout <<"inserisci la temperatura reale"<< endl;
    cin >>tr;

    if(v>=5){
      tp=33+(0.45+0.29*sqrt(v)-0.02*v)*(tr-33);
    }
    else{
        tp=tr;
    }

    cout <<tp;

    return 0;
}