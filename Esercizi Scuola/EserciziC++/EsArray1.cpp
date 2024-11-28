//Leggere e memorizzare in un array di 8 celle, 8 numeri reali, dopo averli memorizzati calcolarne la somma e la media
#include <iostream>

using namespace std;


int main (){
    float val[8];
    for(int i=0; i<8; i++){
        cout<<"inserisci val: ";
        cin>>val[i];
    }

    float somma= 0;

    for(int i=0; i<8; i++){
        somma= somma+val[i];
    }
    cout<<somma<< endl;

    float media=somma/8;
    cout<<media;



}