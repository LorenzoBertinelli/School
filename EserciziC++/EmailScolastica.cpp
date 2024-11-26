#include <iostream>
#include <string.h>
#include <string>
using namespace std;

bool is_password_valid(string password){
    bool maiuscolo=false;
    bool speciale=false;
    bool numero =false;
    for(int i=0; i<password.size(); i++){
        if(password[i]>=65 && password[i]<=90){
            maiuscolo=true;
        }
        if((password[i]>=58 && password[i]<=64) || (password[i]<=38 && password[i]>=33)){
            speciale=true;
        }
        if(password[i]>=48 && password[i]<=57){
            numero=true;
        }

    }
    if(password.size()>=8 && maiuscolo==true && speciale==true && numero==true){
        return true;
    }
    
    return false;
}

int main (){
    string nome,cognome,dominio1,dominio2,email1,email2;
    string password;
    dominio1="studenti.iissgadda.it";//dominio:indirizzo del server che contiene le pagine web di un sito, le cartelle di posta elettronica...
    dominio2="iissgadda.it";
    int scelta;
    cout<<"in questo programma potrai vedere qual'e' la tua Email del Gadda e puoi verificare se la password inserita e' valida"<<endl;
    cout<<"Inserisci la password da testare: ";
    cin>>password;
    if(is_password_valid(password)==true){
        cout<<"la password e' accettabile"<<endl;
    }
    else{
        cout<<"la password non soddisfa i requisiti richiesti ( almeno 8 caratteri, almeno un carattere maiuscolo, almeno un carattere speciale e almeno un numero)"<<endl;
    }
 
do{
    cout<<"Scegli: \n 1 se sei studente\n 2 se sei docente\n 0 per uscire"<<endl;
    cin>>scelta;
    switch (scelta)
    {
    case 1:
        cout<<"Inserisci il tuo nome: "<<endl;
        cin>>nome;
        cout<<"Inserisci il tuo cognome: "<<endl;
        cin>>cognome;
        email1=nome[0]+cognome+'@'+dominio1;
        cout<<"la tua email dell'istituto Superiore di secondo grado Carlo Emilio Gadda di Fornovo di Taro e': "<<email1<<endl;
        break;
    case 2:
        cout<<"Inserisci il tuo nome: "<<endl;
        cin>>nome;
        cout<<"Inserisci il tuo cognome: "<<endl;
        cin>>cognome;
        email2=nome[0]+cognome+'@'+dominio2;
        cout<<"la tua email dell'istituto Superiore di secondo grado Carlo Emilio Gadda di Fornovo di Taro e': "<<email2<<endl;
    
    default:
        break;
}
}while(scelta!=0);
return 0;
}