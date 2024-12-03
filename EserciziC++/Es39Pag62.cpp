// I numeri perfetti sono i divisori del numero ad eccezzione del numero stesso
/*
dati di input: val
dati di output: somma divisori
vincoli di integrità: val>0
*/
#include <iostream>

using namespace std;

int main(){

    int val, cont, SommaDivisori; //SommaDivisori è una variabile accumulatore

    SommaDivisori=0;

    do{
        cout<<"Inserisci un numero maggiore di 0 e il programma calcola i sui numeri perfetti: "<<endl;
        cin>>val;
    }
    while(val<=0);

    cout<<"I divisori di "<<val<<" sono: "<<endl;

    for(cont=1; cont<val; cont++){
        if(val%cont==0){
            SommaDivisori=SommaDivisori+cont;
            cout<<cont<<endl;
        }
    }

    if(SommaDivisori==val){
        cout<<"E' un numero perfetto"<<endl;
    }
    else{
        cout<<"Non e' un numero perfetto"<<endl;
    }

    return 0;
}