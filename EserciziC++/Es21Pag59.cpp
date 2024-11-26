#include <iostream>

using namespace std;

int main(){
    int x;

    cout<<"inserisci punteggio totale: "<<endl;
    cin>>x;
    while(x<0 || x>100){
        cout<<"errore, reinserire punteggio: "<<endl;
        cin>>x;
    }

    if(x<41){
        cout<<"valutazione: E"<<endl;
    }
    else if(x<61){
        cout<<"valutazione: D"<<endl;
    }
    else if(x<71){
        cout<<"valutazione: C"<<endl;
    }
    else if(x<86){
        cout<<"valutazione: B"<<endl;
    }
    else{
        cout<<"valutazione: A"<<endl;
    }
    

    return 0;
}