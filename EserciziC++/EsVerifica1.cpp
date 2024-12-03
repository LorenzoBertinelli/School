#include <iostream>
#include <cmath>

//dati input: peso, altezza
//dati output: valore IMC e profilo
//vincoli integrit�: peso altezza>0

using namespace std;

float IMC(float P, float A){
    float IMC=P/(A*A);
    return IMC;
}

int main()
{
    float P,A;
    cout<<"Inserisci il peso in kg: ";
    cin>>P;
    cout<<"Inserisci l'altezza in metri: ";
    cin>>A;

    float imc=IMC(P,A);

    cout<<"Il valore IMC e': "<<imc<<endl;


    if(imc>=30){
        cout<<"Sei obeso/a"<<endl;
    }
    else if(imc>30 && imc>=25){
        cout<<"Sei in sovrappeso"<<endl;
    }
    else if(imc>25 && imc>=18){
        cout<<"Sei regolare"<<endl;
    }
    else if(imc<18){
        cout<<"Sei magra/o"<<endl;
    }
}