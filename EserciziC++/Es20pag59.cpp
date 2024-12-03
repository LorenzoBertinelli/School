#include <iostream>

 

using namespace std;

 

int main()
{
    float prezzototale, sconto, prezzoscontato;
    float c1=0.05, c2=0.10, c3=0.20;

 

    cout<<"Inserisci il prezzo totale: "<<endl;
    cin>>prezzototale;

 

    if(prezzototale>0){

        if(prezzototale<=50){
        cout<<"Sconto del 5% "<<endl;
        sconto=prezzototale*c1;
        }
        else if(prezzototale>50 && prezzototale<=100){
        cout<<"Sconto del 10% "<<endl;
        sconto=prezzototale*c2;
        }
        else  {
        cout<<"Sconto del 20%"<<endl;
        sconto=prezzototale*c3;
        }
         prezzoscontato=prezzototale-sconto;
        cout<<"Lo sconto e':"<<sconto<<endl;
        cout<<"Il prezzo scontato e': "<<prezzoscontato<<endl;
    }
      else{
         cout<<"Errore di input"<<endl;
    }
    return 0;
}
