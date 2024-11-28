//Array dinamico: varia la dimensione
//per le istruzioni vedi word su teams
#include <iostream>
#include <cstdlib> //per includere new e delate

using namespace std;

int main (){
    int dim;
    cout<<"Dimensione array?"<<endl;
    cin>>dim;

    int *p= new int[dim]; //allocazione dinamica della memoria (la sintassi dellìarray dinamico prevede che si scriva: new int[dim])
    //inserisco i valori nel vettore
    for(int i=0; i<dim; i++){
        cout<<"Valore elemento: "<<i<<endl;
        cin>>p[i];
    }

    //stampa array

    for(int i=0; i<dim; i++){
        cout<<"p ["<<i<<"]: "<<p[i]<<endl;
    }

    cout<<endl;
    cout<<"Numero elementi da conservare?"<<endl;
    cin>>dim;

    int *p2=new int [dim];

    //copio i valori

    for(int i=0; i<dim; i++){
        p2[i]=p[i];
    }

    //deallocazione primo array

    delete[] p;  //oppure: delete p;
    cout<<endl;

    //stampo il sotto-array

    cout<<"Sotto/array: "<<endl;

    for(int i=0; i<dim; i++){
        cout<<"p ["<<i<<"]: "<<p2[i]<<endl;
    }

    //deallocazzione sotto-array

    delete [] p2;
    
    return 0;
}