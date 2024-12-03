/*Es18 Pag 59*/
#include <iostream>

/*-	Dati di input: condizioni, velocità
-	Dati di output: spazio di frenata
-	Vincoli di integrità: valocità>=0, asfalto ruvido, liscio, bagnato o ghiacciato
*/

 using namespace std;

int main(){

    float V, F, S; 
    int cs; //condizioni stradali
    char ruvido, liscio, bagnato, ghiacciato;
    cout<<"inserisci la velocita': "<< endl;
    cin>>V;

    if(V<0){
        cout<<"errore di input"<< endl;
    }
    else{
        cout<<"inserisci le condizioni stradali (ruvido, liscio, bagnato o ghiacciato): "<<endl;
        cin>>cs;
        if(cs==ruvido){
            F=0.6;
            S=(V*V)/(250*F);
            cout<<"lo spazio di frenata e': " << S <<"m"<< endl ;
        }
        else if(cs==liscio){
            F=0.5;
            S=(V*V)/(250*F);
            cout<<"lo spazio di frenata e': " << S <<"m"<< endl ;
        }
        else if(cs==bagnato){
            F=0.4;
            S=(V*V)/(250*F);
            cout<<"lo spazio di frenata e': " << S <<"m"<< endl ;
        }
        else if(cs==ghiacciato){
            F=0.1;
            S=(V*V)/(250*F);
            cout<<"lo spazio di frenata e': " << S <<"m"<< endl ;
        }
    }

    return 0;
}