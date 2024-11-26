#include <iostream>       // massa persa in un anno=massa residua*costante decadimento del materiale

using namespace std;

int main(){
    float massainiziale, massaresidua2, costantedecadimento, massaresidua, anni;
    int cont;

    cont=0;

    do{
        
    cout<<"Inserisci la massa iniziale del materiale in grammi maggiore di 0: "<<endl;
    cin>>massainiziale;
    cout<<"Inserisci la costante del dicadimento del materiale: "<<endl;
    cin>>costantedecadimento;
    cout<<"Inserisci gli anni trascorsi: "<<endl;
    cin>>anni;

    if(massainiziale==0 && costantedecadimento==0){
        cout<<"Errore! Reinserire i dati"<<endl; 
    }
        
    }
    while(massainiziale<=0 or costantedecadimento<=0);

    massaresidua=massainiziale;

    while (anni>0){
        massaresidua=massainiziale-(massaresidua*costantedecadimento); //massaresidua*costantedecadimento -> massa persa all'anno
        anni--;
    } 

    cout<<"la massa residua e' di: "<<massaresidua<<endl;

    while(massaresidua>1){
            massaresidua2=massainiziale-(massaresidua2*costantedecadimento);
            cont++;
    }
    
    cout<<"Ci vogliono "<<cont<<" anni per far si  che la massa residua del materiale si minore di 1g"<<endl;
    

    return 0;
}