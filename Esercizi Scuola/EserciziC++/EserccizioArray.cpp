//Leggere e memorizzare in un array sette numeri, dopo averli letti contare quante volte è stato memorizzato lo zero.

#include <iostream>

using namespace std;


int main (){
    int val[7];

    for(int i=0; i<7; i++){
        cout<<"Inserisci il valore: ";
        cin>>val[i];
    }

    int cont=0;

    for(int i=0; i<7; i++){
        if(val[i]==0){
            cont++;
        }
    }

    cout<<cont;



}