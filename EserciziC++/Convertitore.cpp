/*codificare una funzine in linguaggio c++ che passati come parametro un numero decimale lo converta
e restituisca in binario.
-uso di un vettore*/
#include <iostream>
#include <string.h>
#include <string>
using namespace std;

void convertitore_decimale_binario(int decimale, int binario[]){
    int i=7;
    while(decimale!=0){
        binario[i]=decimale%2;
        decimale=decimale/2;
        i--;
    }
}

int main (){
    int binario[8]={0};
    int decimale;
    int i=0;

    cout<<"inserisci un numero decimale da convertire in binario: "<<endl;
    cin>>decimale;

    convertitore_decimale_binario(decimale, binario);

    for(i=7;i>0,i++){
        cout<<binario[i];
    }

    return 0;
}