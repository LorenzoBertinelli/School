#include <iostream>
#include <string>

using namespace std;

/* la struttura è un insieme di dati non omogenei identificati da un nome e da un tipo definito detto campo, 
l'inseieme dei dati deve averela parola struct, il nome e racchiusa tra parentesi graffe */

struct data{
    int giorno;
    int mese;
    int anno;
};

//tipo di dato
struct nominativo{
    string nome; 
    string cognome;
    data datanascita; //definisco il campo di tipo data e gli assegno la variabile datanascita
};


int main(){

    nominativo contatto; //definisco la variabile di tipo nominatico e gli assegno il nome contatto

    cout<<"Inserisci il nome della persona: "<<endl;
    cin>>contatto.nome;
    cout<<"Inserisci il cognome della persona: "<<endl;
    cin>>contatto.cognome;
    cout<<"Inserisci il giorno di nascita della persona: "<<endl;
    cin>>contatto.datanascita.giorno;
    cout<<"Inserisci il mese di nascita della persona (in nuemero): "<<endl;
    cin>>contatto.datanascita.mese;
    cout<<"Inserisci l'anno di nascita della persona: "<<endl;
    cin>>contatto.datanascita.anno;



    cout<<"Nome: "<<contatto.nome<<endl;
    cout<<"Cognome: "<<contatto.cognome<<endl;
    cout<<"la data di nascita e': "<<contatto.datanascita.giorno<<"/"<<contatto.datanascita.mese<<"/"<<contatto.datanascita.anno<<endl;

    return 0;
}