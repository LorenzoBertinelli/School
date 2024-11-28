#include <iostream>
#include <math.h>
#include <stdexcept>

using namespace std;

float spazio_frenata(float velocita, string condizione_strada ){
    
    float coefficente;
    
    if(condizione_strada == "asfalto ruvido"){
        coefficente=0.6;
    }
    else if (condizione_strada == "asfalto liscio"){
        coefficente=0.5;
    }
    else if (condizione_strada == "asfalto bagnato"){
        coefficente=0.4;
    }
    else if (condizione_strada == "asfalto ghiacciato"){
        coefficente=0.1;
    }
    else{
        // lancio eccezione. Qui si interrompe le funzione
        throw invalid_argument("errore, condizione stradale non corretta"); 
    }

    float spazio_frenata=pow(velocita,2)/250*coefficente;

    return spazio_frenata;
   
}


int main(){

    string condizione_strada;
    float velocita, risultato;

    cout<<"Ciao, benvenuto in questo programma che calcola lo spazio di frenata della macchina"<<endl;
    cout<<"Inserisci la velocita' della macchina: "<<endl;
    cin>>velocita;
    cout<<"Inserisci la condizione stradale (ruvido, liscio, baganto o ghicciato): "<<endl;
    cin>>condizione_strada;

    risultato= spazio_frenata(velocita, condizione_strada);

    cout<<"lo spazio di frenata e' di: "<<risultato<<endl;


    return 0;
}