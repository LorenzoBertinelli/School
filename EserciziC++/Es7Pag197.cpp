#include <iostream>
#include <string>
#include <cmath>
#include "Es7Pag197.h"

using namespace std;


posizione puntoA, puntoB;

int main(){
    posizione pos;
    cout<<"Inserisci una longitudine punto A compresa tra -180° e 180°: "<<endl;
    cin>>puntoA.longitudine;
    cout<<"Inserisci una longitudine punto B compresa tra -180° e 180°: "<<endl;
    cin>>puntoB.longitudine;
    cout<<"Inserisci una latitudine punto A compresa tra -90° e 90°: "<<endl;
    cin>>puntoA.lat;
    cout<<"Inserisci una longitudine punto B compresa tra -180° e 180°: "<<endl;
    cin>>puntoB.lat;


    cout<<calcolapercosro(puntoA,puntoB);



    return 0;
}